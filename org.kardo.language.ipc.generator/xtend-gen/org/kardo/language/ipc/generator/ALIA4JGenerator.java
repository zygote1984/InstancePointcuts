package org.kardo.language.ipc.generator;

import com.google.common.base.Objects;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.emftext.language.java.types.TypeReference;
import org.kardo.language.ipc.InstancePointcut;
import org.kardo.language.ipc.generator.AspectJCompilationUnitGenerator;
import org.kardo.language.ipc.generator.Utility;

@SuppressWarnings("all")
public class ALIA4JGenerator {
  private InstancePointcut ip;
  
  private String adviceTarget = "";
  
  private String liam = "org.alia4j.liam.";
  
  private String parserfqn = "org.alia4j.aspectj.parser.ast.";
  
  private String zygotelib = "zygote.instancepc.lib.alia4j.";
  
  private String parserclass = new Function0<String>() {
    public String apply() {
      String _plus = (ALIA4JGenerator.this.zygotelib + "ALIA4JParser");
      return _plus;
    }
  }.apply();
  
  private String specclass = new Function0<String>() {
    public String apply() {
      String _plus = (ALIA4JGenerator.this.zygotelib + "ALIA4JSpecializationModule");
      return _plus;
    }
  }.apply();
  
  private String attachclass = new Function0<String>() {
    public String apply() {
      String _plus = (ALIA4JGenerator.this.zygotelib + "ALIA4JAttachmentModule");
      return _plus;
    }
  }.apply();
  
  public ALIA4JGenerator() {
  }
  
  public CharSequence ipToALIA(final String pcexp, final String element) {
    CharSequence _xblockexpression = null;
    {
      System.out.println("[ALIA4JGenerator]: ipToAlia");
      this.generateAdviceTarget();
      StringConcatenation _builder = new StringConcatenation();
      _builder.newLine();
      _builder.append("public void createAttachmentFor");
      String _name = this.ip.getName();
      String _firstUpper = StringExtensions.toFirstUpper(_name);
      _builder.append(_firstUpper, "");
      String _firstUpper_1 = StringExtensions.toFirstUpper(element);
      _builder.append(_firstUpper_1, "");
      _builder.append("(){");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      CharSequence _generateParserMethod = this.generateParserMethod(pcexp, element);
      _builder.append(_generateParserMethod, "	");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      CharSequence _generateSpecialization = this.generateSpecialization(element);
      _builder.append(_generateSpecialization, "	");
      _builder.newLineIfNotEmpty();
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  public InstancePointcut setIP(final InstancePointcut ip) {
    InstancePointcut _ip = this.ip = ip;
    return _ip;
  }
  
  public void generateDeploy() {
    UnsupportedOperationException _unsupportedOperationException = new UnsupportedOperationException("Auto-generated function stub");
    throw _unsupportedOperationException;
  }
  
  public CharSequence generateParserMethod(final String pcexp, final String element) {
    CharSequence _xblockexpression = null;
    {
      String _name = this.ip.getName();
      String _plus = ("parser_" + _name);
      String _plus_1 = (_plus + "_");
      String parser = (_plus_1 + element);
      String _name_1 = this.ip.getName();
      String _firstUpper = StringExtensions.toFirstUpper(_name_1);
      String _plus_2 = ("parse" + _firstUpper);
      String _firstUpper_1 = StringExtensions.toFirstUpper(element);
      String method = (_plus_2 + _firstUpper_1);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(this.parserfqn, "");
      _builder.append("AJPointcutParser ");
      _builder.append(parser, "");
      _builder.append(" = ");
      _builder.append(this.parserclass, "");
      _builder.append(".parseExpression(\"");
      _builder.append(pcexp, "");
      _builder.append("\");");
      _builder.newLineIfNotEmpty();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  public CharSequence generateSpecialization(final String element) {
    CharSequence _xblockexpression = null;
    {
      String _name = this.ip.getName();
      String _plus = ("spec_" + _name);
      String _plus_1 = (_plus + "_");
      String specset = (_plus_1 + element);
      String _name_1 = this.ip.getName();
      String _firstUpper = StringExtensions.toFirstUpper(_name_1);
      String _plus_2 = ("initSpecialization" + _firstUpper);
      String _firstUpper_1 = StringExtensions.toFirstUpper(element);
      String method = (_plus_2 + _firstUpper_1);
      TypeReference _type = this.ip.getType();
      String instanceType = Utility.resolveReference(_type);
      String _name_2 = this.ip.getName();
      String _plus_3 = ("parser_" + _name_2);
      String _plus_4 = (_plus_3 + "_");
      String parser = (_plus_4 + element);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Set<");
      _builder.append(this.liam, "");
      _builder.append("Specialization> ");
      _builder.append(specset, "");
      _builder.append(" = ");
      _builder.append(this.specclass, "");
      _builder.append(".createFromStaticMethod(");
      _builder.append(parser, "");
      _builder.append(", ");
      _builder.append(instanceType, "");
      _builder.append(".class);");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      CharSequence _generateAttachment = this.generateAttachment(element);
      _builder.append(_generateAttachment, "");
      _builder.newLineIfNotEmpty();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  public CharSequence generateAttachment(final String element) {
    CharSequence _xblockexpression = null;
    {
      String _name = this.ip.getName();
      String _plus = ("spec_" + _name);
      String _plus_1 = (_plus + "_");
      String specset = (_plus_1 + element);
      String adviceMethod = "";
      String scheduleinfo = "";
      TypeReference _type = this.ip.getType();
      String instanceType = Utility.resolveReference(_type);
      String _name_1 = this.ip.getName();
      String _plus_2 = ("parser_" + _name_1);
      String _plus_3 = (_plus_2 + "_");
      String parser = (_plus_3 + element);
      String _name_2 = this.ip.getName();
      String _plus_4 = ("attachment_" + _name_2);
      String _plus_5 = (_plus_4 + "_");
      String attachment = (_plus_5 + element);
      boolean _matched = false;
      if (!_matched) {
        if (Objects.equal(element,"ba")) {
          _matched=true;
          String _name_3 = this.ip.getName();
          String _plus_6 = (_name_3 + "_addInstance");
          adviceMethod = _plus_6;
          scheduleinfo = "ScheduleInfo.BEFORE";
        }
      }
      if (!_matched) {
        if (Objects.equal(element,"aa")) {
          _matched=true;
          String _name_4 = this.ip.getName();
          String _plus_7 = (_name_4 + "_addInstance");
          adviceMethod = _plus_7;
          scheduleinfo = "ScheduleInfo.AFTER";
        }
      }
      if (!_matched) {
        if (Objects.equal(element,"br")) {
          _matched=true;
          String _name_5 = this.ip.getName();
          String _plus_8 = (_name_5 + "_removeInstance");
          adviceMethod = _plus_8;
          scheduleinfo = "ScheduleInfo.BEFORE";
        }
      }
      if (!_matched) {
        if (Objects.equal(element,"ar")) {
          _matched=true;
          String _name_6 = this.ip.getName();
          String _plus_9 = (_name_6 + "_removeInstance");
          adviceMethod = _plus_9;
          scheduleinfo = "ScheduleInfo.AFTER";
        }
      }
      String _plus_10 = (this.liam + scheduleinfo);
      scheduleinfo = _plus_10;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(this.liam, "");
      _builder.append("Attachment ");
      _builder.append(attachment, "");
      _builder.append(" = ");
      _builder.append(this.attachclass, "");
      _builder.append(".createStaticAttachment(");
      _builder.append(specset, "");
      _builder.append(", ");
      _builder.append(this.adviceTarget, "");
      _builder.append(".class, ");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t\t\t\t\t");
      _builder.append("\"");
      _builder.append(adviceMethod, "							");
      _builder.append("\", new Class[] {");
      _builder.append(instanceType, "							");
      _builder.append(".class}, ");
      _builder.append(scheduleinfo, "							");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("org.alia4j.fial.System.deploy(");
      _builder.append(attachment, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  public String generateAdviceTarget() {
    String _name = this.ip.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    String _plus = (_firstUpper + "AdviceTarget");
    String _adviceTarget = this.adviceTarget = _plus;
    return _adviceTarget;
  }
  
  public CharSequence generateMaintenance(final String adviceTarget) {
    CharSequence _xblockexpression = null;
    {
      TypeReference _type = this.ip.getType();
      String instanceType = Utility.resolveReference(_type);
      String _name = this.ip.getName();
      String setName = (_name + "_set");
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package ");
      _builder.append(AspectJCompilationUnitGenerator.packageNameAspect, "");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("import com.google.common.collect.*;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("public class ");
      _builder.append(adviceTarget, "");
      _builder.newLineIfNotEmpty();
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("static Multiset<");
      _builder.append(instanceType, "	");
      _builder.append("> ");
      _builder.append(setName, "	");
      _builder.append(" = HashMultiset.create();");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public static boolean addToSet(");
      _builder.append(instanceType, "	");
      _builder.append(" o)");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("return ");
      _builder.append(setName, "		");
      _builder.append(".add(o);");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public static boolean removeFromSet(");
      _builder.append(instanceType, "	");
      _builder.append(" o)");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("return ");
      _builder.append(setName, "		");
      _builder.append(".remove(o);\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("}\t");
      _builder.newLine();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
}
