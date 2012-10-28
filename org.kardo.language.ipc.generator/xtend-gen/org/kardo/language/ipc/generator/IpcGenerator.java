package org.kardo.language.ipc.generator;

import com.google.common.base.Objects;
import java.io.ByteArrayOutputStream;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.emftext.language.java.types.TypeReference;
import org.kardo.language.aspectj.pcexp.PointcutExpression;
import org.kardo.language.ipc.AfterEvent;
import org.kardo.language.ipc.BeforeEvent;
import org.kardo.language.ipc.InstancePointcut;
import org.kardo.language.ipc.IpcExpression;
import org.kardo.language.ipc.IpcSubExpression;
import org.kardo.language.ipc.generator.ALIA4JGenerator;
import org.kardo.language.ipc.generator.AspectJCompilationUnitGenerator;
import org.kardo.language.ipc.generator.AspectJPrinterSub;
import org.kardo.language.ipc.generator.FileCreator;
import org.kardo.language.ipc.generator.PcExpType;
import org.kardo.language.ipc.generator.Utility;
import org.kardo.language.ipc.resource.ipc.IIpcTextResource;

@SuppressWarnings("all")
public class IpcGenerator {
  private AspectJPrinterSub printer;
  
  private ByteArrayOutputStream output = new Function0<ByteArrayOutputStream>() {
    public ByteArrayOutputStream apply() {
      ByteArrayOutputStream _byteArrayOutputStream = new ByteArrayOutputStream();
      return _byteArrayOutputStream;
    }
  }.apply();
  
  private Resource resource;
  
  private ALIA4JGenerator aliagen = new Function0<ALIA4JGenerator>() {
    public ALIA4JGenerator apply() {
      ALIA4JGenerator _aLIA4JGenerator = new ALIA4JGenerator();
      return _aLIA4JGenerator;
    }
  }.apply();
  
  public IpcGenerator(final Resource resource) {
    this.resource = resource;
    AspectJPrinterSub _aspectJPrinterSub = new AspectJPrinterSub(this.output, ((IIpcTextResource) resource));
    this.printer = _aspectJPrinterSub;
  }
  
  public CharSequence generateIpc(final InstancePointcut pc) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _generateMonitoringPointcuts = this.generateMonitoringPointcuts(pc);
    _builder.append(_generateMonitoringPointcuts, "");
    _builder.newLineIfNotEmpty();
    CharSequence _generateInstancePc = this.generateInstancePc(pc, PcExpType.SELECT);
    _builder.append(_generateInstancePc, "");
    _builder.newLineIfNotEmpty();
    {
      IpcExpression _expr = pc.getExpr();
      IpcSubExpression _removeExpression = _expr.getRemoveExpression();
      boolean _notEquals = (!Objects.equal(_removeExpression, null));
      if (_notEquals) {
        CharSequence _generateInstancePc_1 = this.generateInstancePc(pc, PcExpType.REMOVE);
        _builder.append(_generateInstancePc_1, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence generateInstancePc(final InstancePointcut pc, final PcExpType type) {
    CharSequence _xblockexpression = null;
    {
      String pcname = "";
      String setOperation = " ";
      IpcSubExpression expTemp = null;
      this.aliagen.setIP(pc);
      this.generateSetMaintenanceClass(pc);
      CharSequence _switchResult = null;
      boolean _matched = false;
      if (!_matched) {
        if (Objects.equal(type,PcExpType.REMOVE)) {
          _matched=true;
          CharSequence _xblockexpression_1 = null;
          {
            System.out.println("[generate instance pointcut] generate remove expression");
            setOperation = "remove";
            IpcExpression _expr = pc.getExpr();
            IpcSubExpression _removeExpression = _expr.getRemoveExpression();
            expTemp = _removeExpression;
            CharSequence _generateIpExpression = this.generateIpExpression(expTemp, "r");
            _xblockexpression_1 = (_generateIpExpression);
          }
          _switchResult = _xblockexpression_1;
        }
      }
      if (!_matched) {
        if (Objects.equal(type,PcExpType.SELECT)) {
          _matched=true;
          CharSequence _xblockexpression_2 = null;
          {
            System.out.println("[generate instance pointcut] generate add expression");
            String _name = pc.getName();
            pcname = _name;
            setOperation = "add";
            IpcExpression _expr = pc.getExpr();
            IpcSubExpression _addExpression = _expr.getAddExpression();
            expTemp = _addExpression;
            CharSequence _generateIpExpression = this.generateIpExpression(expTemp, "a");
            _xblockexpression_2 = (_generateIpExpression);
          }
          _switchResult = _xblockexpression_2;
        }
      }
      _xblockexpression = (_switchResult);
    }
    return _xblockexpression;
  }
  
  public CharSequence generateMonitoringPointcuts(final InstancePointcut ip) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = ip.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    String adviceTarget = (_firstUpper + "AdviceTarget");
    _builder.newLineIfNotEmpty();
    String name = ip.getName();
    _builder.newLineIfNotEmpty();
    TypeReference _type = ip.getType();
    String type = Utility.resolveReference(_type);
    _builder.newLineIfNotEmpty();
    _builder.append("public pointcut ");
    _builder.append(name, "");
    _builder.append("_instanceAdded(");
    _builder.append(type, "");
    _builder.append(" instance): \tcall(public static void ");
    _builder.append(adviceTarget, "");
    _builder.append(".");
    _builder.append(name, "");
    _builder.append("_instanceAdded(..)) && args(instance);");
    _builder.newLineIfNotEmpty();
    _builder.append("public pointcut ");
    _builder.append(name, "");
    _builder.append("_instanceremoved(");
    _builder.append(type, "");
    _builder.append(" instance): \tcall(public static void ");
    _builder.append(adviceTarget, "");
    _builder.append(".");
    _builder.append(name, "");
    _builder.append("_instanceRemoved(..)) && args(instance);\t");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence generateIpExpression(final IpcSubExpression exp, final String exptype) {
    StringConcatenation _builder = new StringConcatenation();
    {
      BeforeEvent _before = exp.getBefore();
      boolean _notEquals = (!Objects.equal(_before, null));
      if (_notEquals) {
        BeforeEvent _before_1 = exp.getBefore();
        PointcutExpression _pcexp = _before_1.getPcexp();
        String _generateExpression = AspectJCompilationUnitGenerator.generateExpression(((PointcutExpression) _pcexp));
        String _plus = ("b" + exptype);
        CharSequence _ipToALIA = this.aliagen.ipToALIA(_generateExpression, _plus);
        _builder.append(_ipToALIA, "");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      AfterEvent _after = exp.getAfter();
      boolean _notEquals_1 = (!Objects.equal(_after, null));
      if (_notEquals_1) {
        AfterEvent _after_1 = exp.getAfter();
        PointcutExpression _pcexp_1 = _after_1.getPcexp();
        String _generateExpression_1 = AspectJCompilationUnitGenerator.generateExpression(((PointcutExpression) _pcexp_1));
        String _plus_1 = ("a" + exptype);
        CharSequence _ipToALIA_1 = this.aliagen.ipToALIA(_generateExpression_1, _plus_1);
        _builder.append(_ipToALIA_1, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public void generateSetMaintenanceClass(final InstancePointcut ip) {
    String _name = ip.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    String adviceTarget = (_firstUpper + "AdviceTarget");
    String _plus = (adviceTarget + ".java");
    CharSequence _generateSetMaintenanctClassBody = this.generateSetMaintenanctClassBody(ip);
    FileCreator.instance.generateFile(_plus, _generateSetMaintenanctClassBody);
  }
  
  public CharSequence generateSetMaintenanctClassBody(final InstancePointcut ip) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import java.util.*;");
    _builder.newLine();
    String _name = ip.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    String adviceTarget = (_firstUpper + "AdviceTarget");
    _builder.newLineIfNotEmpty();
    String name = ip.getName();
    _builder.newLineIfNotEmpty();
    String setname = (name + "_data");
    _builder.newLineIfNotEmpty();
    TypeReference _type = ip.getType();
    String type = Utility.resolveReference(_type);
    _builder.newLineIfNotEmpty();
    _builder.append("public class ");
    _builder.append(adviceTarget, "");
    _builder.append("{");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private static WeakHashMap<");
    _builder.append(type, "	");
    _builder.append(", Integer> ");
    _builder.append(setname, "	");
    _builder.append(" = new WeakHashMap<");
    _builder.append(type, "	");
    _builder.append(", Integer>();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static Set<");
    _builder.append(type, "	");
    _builder.append("> ");
    _builder.append(name, "	");
    _builder.append("()");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return Collections.unmodifiableSet(");
    _builder.append(setname, "		");
    _builder.append(".keySet());");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static void ");
    _builder.append(name, "	");
    _builder.append("_addInstance(");
    _builder.append(type, "	");
    _builder.append(" instance)");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if(");
    _builder.append(setname, "		");
    _builder.append(".containsKey(instance))");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("Integer value = ");
    _builder.append(setname, "			");
    _builder.append(".get(instance);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("value++;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append(setname, "			");
    _builder.append(".put(instance,value);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("else");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append(setname, "			");
    _builder.append(".put(instance, new Integer(1));");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append(name, "		");
    _builder.append("_instanceAdded(instance);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static void ");
    _builder.append(name, "	");
    _builder.append("_removeInstance(");
    _builder.append(type, "	");
    _builder.append(" instance)");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if(");
    _builder.append(setname, "		");
    _builder.append(".containsKey(instance))");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("Integer value = ");
    _builder.append(setname, "			");
    _builder.append(".get(instance);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("value--;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("if(value == 0)");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append(setname, "				");
    _builder.append(".remove(instance);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("else\t");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append(setname, "				");
    _builder.append(".put(instance,value);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append(name, "		");
    _builder.append("_instanceRemoved(instance);\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static int ");
    _builder.append(name, "	");
    _builder.append("_cardinality(");
    _builder.append(type, "	");
    _builder.append(" instance)");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return ");
    _builder.append(setname, "		");
    _builder.append(".get(instance);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private static void ");
    _builder.append(name, "	");
    _builder.append("_setCardinality(");
    _builder.append(type, "	");
    _builder.append(" instance, int c)");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append(setname, "		");
    _builder.append(".put(instance, new Integer(c));");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static void ");
    _builder.append(name, "	");
    _builder.append("_instanceAdded(");
    _builder.append(type, "	");
    _builder.append(" instance){}");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("public static void ");
    _builder.append(name, "	");
    _builder.append("_instanceRemoved(");
    _builder.append(type, "	");
    _builder.append(" instance){}");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}\t");
    _builder.newLine();
    return _builder;
  }
}
