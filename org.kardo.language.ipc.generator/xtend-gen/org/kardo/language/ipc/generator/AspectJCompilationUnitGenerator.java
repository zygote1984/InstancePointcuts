package org.kardo.language.ipc.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.io.ByteArrayOutputStream;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.emftext.language.java.classifiers.ConcreteClassifier;
import org.emftext.language.java.expressions.ConditionalExpression;
import org.emftext.language.java.imports.Import;
import org.emftext.language.java.members.Member;
import org.emftext.language.java.modifiers.Abstract;
import org.emftext.language.java.parameters.Parameter;
import org.emftext.language.java.types.TypeReference;
import org.kardo.language.aspectj.commons.Aspect;
import org.kardo.language.aspectj.commons.AspectJCompilationUnit;
import org.kardo.language.aspectj.commons.AspectMember;
import org.kardo.language.aspectj.pcexp.PointcutExpression;
import org.kardo.language.aspectj.pointcuts.AspectJPointcut;
import org.kardo.language.aspectj.pointcuts.PrimitivePointcut;
import org.kardo.language.ipc.Ipc;
import org.kardo.language.ipc.generator.GeneratorMain;
import org.kardo.language.ipc.generator.IpcGenerator;
import org.kardo.language.ipc.generator.IpcPrinterSub;
import org.kardo.language.ipc.generator.Utility;
import org.kardo.language.ipc.resource.ipc.IIpcTextResource;

@SuppressWarnings("all")
public class AspectJCompilationUnitGenerator {
  private boolean print = true;
  
  public static String packageNameAspect;
  
  public static ByteArrayOutputStream output = new Function0<ByteArrayOutputStream>() {
    public ByteArrayOutputStream apply() {
      ByteArrayOutputStream _byteArrayOutputStream = new ByteArrayOutputStream();
      return _byteArrayOutputStream;
    }
  }.apply();
  
  public static IpcPrinterSub printer = new Function0<IpcPrinterSub>() {
    public IpcPrinterSub apply() {
      IpcPrinterSub _ipcPrinterSub = new IpcPrinterSub(AspectJCompilationUnitGenerator.output, ((IIpcTextResource) GeneratorMain.resource));
      return _ipcPrinterSub;
    }
  }.apply();
  
  private AspectJCompilationUnit compilationUnit;
  
  private IpcGenerator ipcgen = new Function0<IpcGenerator>() {
    public IpcGenerator apply() {
      IpcGenerator _ipcGenerator = new IpcGenerator(GeneratorMain.resource);
      return _ipcGenerator;
    }
  }.apply();
  
  private Resource resource = GeneratorMain.resource;
  
  public AspectJCompilationUnitGenerator() {
  }
  
  public String setAspect(final AspectJCompilationUnit aspect) {
    String _xblockexpression = null;
    {
      this.compilationUnit = aspect;
      String _namespacesAsString = aspect.getNamespacesAsString();
      String _packageNameAspect = AspectJCompilationUnitGenerator.packageNameAspect = _namespacesAsString;
      _xblockexpression = (_packageNameAspect);
    }
    return _xblockexpression;
  }
  
  public CharSequence compileUnit() {
    StringConcatenation _builder = new StringConcatenation();
    EList<ConcreteClassifier> _classifiers = this.compilationUnit.getClassifiers();
    Iterable<Aspect> aspects = Iterables.<Aspect>filter(_classifiers, Aspect.class);
    _builder.newLineIfNotEmpty();
    {
      for(final Aspect a : aspects) {
        System.out.println("[Aspects]");
        _builder.newLineIfNotEmpty();
        CharSequence _generateAspect = this.generateAspect(a);
        _builder.append(_generateAspect, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence generateAspect(final Aspect aspect) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _namespacesAsString = this.compilationUnit.getNamespacesAsString();
      boolean _notEquals = (!Objects.equal(_namespacesAsString, null));
      if (_notEquals) {
        String _namespacesAsString_1 = this.compilationUnit.getNamespacesAsString();
        _builder.append(_namespacesAsString_1, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    EList<Import> _imports = this.compilationUnit.getImports();
    String _generateImports = Utility.generateImports(_imports);
    _builder.append(_generateImports, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("aspect ");
    String _name = aspect.getName();
    _builder.append(_name, "");
    _builder.append(" ");
    {
      org.emftext.language.java.classifiers.Class _superClass = aspect.getSuperClass();
      boolean _notEquals_1 = (!Objects.equal(_superClass, null));
      if (_notEquals_1) {
        _builder.append(" extends ");
        TypeReference _extend = aspect.getExtend();
        String _resolveReference = Utility.resolveReference(_extend);
        _builder.append(_resolveReference, "");
        _builder.append(" ");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    EList<Member> _members = aspect.getMembers();
    Iterable<AspectMember> pcs = Iterables.<AspectMember>filter(_members, AspectMember.class);
    _builder.newLineIfNotEmpty();
    {
      for(final AspectMember p : pcs) {
        {
          if ((p instanceof AspectJPointcut)) {
            _builder.append("\t");
            CharSequence _generateAJPointcut = this.generateAJPointcut(((AspectJPointcut) p));
            _builder.append(_generateAJPointcut, "	");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          if ((p instanceof Ipc)) {
            _builder.append("\t");
            CharSequence _generate = this.ipcgen.generate(((Ipc) p));
            _builder.append(_generate, "	");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateAJPointcut(final AspectJPointcut pc) {
    try {
      StringConcatenation _builder = new StringConcatenation();
      {
        Abstract _abstract = pc.getAbstract();
        boolean _notEquals = (!Objects.equal(_abstract, null));
        if (_notEquals) {
          Abstract _abstract_1 = pc.getAbstract();
          AspectJCompilationUnitGenerator.printer.print(_abstract_1);
          _builder.append(AspectJCompilationUnitGenerator.output, "");
        }
      }
      _builder.append("pointcut ");
      String _name = pc.getName();
      _builder.append(_name, "");
      _builder.append("(");
      EList<Parameter> _parameters = pc.getParameters();
      String _parameterExpand = Utility.parameterExpand(_parameters);
      _builder.append(_parameterExpand, "");
      _builder.append(") ");
      {
        ConditionalExpression _exp = pc.getExp();
        boolean _notEquals_1 = (!Objects.equal(_exp, null));
        if (_notEquals_1) {
          _builder.append(" : ");
          ConditionalExpression _exp_1 = pc.getExp();
          String _generateExpression = AspectJCompilationUnitGenerator.generateExpression(((PointcutExpression) _exp_1));
          _builder.append(_generateExpression, "");
          _builder.append(" ");
        }
      }
      _builder.append(" ;");
      _builder.newLineIfNotEmpty();
      return _builder;
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public String packagePrinter(final org.emftext.language.java.containers.Package p) {
    try {
      AspectJCompilationUnitGenerator.printer.print(p);
      String value = AspectJCompilationUnitGenerator.output.toString();
      AspectJCompilationUnitGenerator.output.reset();
      IpcPrinterSub _ipcPrinterSub = new IpcPrinterSub(AspectJCompilationUnitGenerator.output, ((IIpcTextResource) this.resource));
      AspectJCompilationUnitGenerator.printer = _ipcPrinterSub;
      return value;
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected String _generatePointcut(final PrimitivePointcut exp) {
    try {
      AspectJCompilationUnitGenerator.printer.print(exp);
      String value = AspectJCompilationUnitGenerator.output.toString();
      AspectJCompilationUnitGenerator.output.reset();
      IpcPrinterSub _ipcPrinterSub = new IpcPrinterSub(AspectJCompilationUnitGenerator.output, ((IIpcTextResource) this.resource));
      AspectJCompilationUnitGenerator.printer = _ipcPrinterSub;
      return value;
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static String generateExpression(final PointcutExpression exp) {
    try {
      AspectJCompilationUnitGenerator.printer.print(exp);
      String value = AspectJCompilationUnitGenerator.output.toString();
      AspectJCompilationUnitGenerator.output.reset();
      IpcPrinterSub _ipcPrinterSub = new IpcPrinterSub(AspectJCompilationUnitGenerator.output, ((IIpcTextResource) GeneratorMain.resource));
      AspectJCompilationUnitGenerator.printer = _ipcPrinterSub;
      return value;
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public String generatePointcut(final PrimitivePointcut exp) {
    {
      return _generatePointcut(exp);
    }
  }
}
