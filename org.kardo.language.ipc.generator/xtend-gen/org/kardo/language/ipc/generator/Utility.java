package org.kardo.language.ipc.generator;

import com.google.common.base.Objects;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.emftext.language.java.classifiers.Classifier;
import org.emftext.language.java.commons.Commentable;
import org.emftext.language.java.imports.Import;
import org.emftext.language.java.parameters.OrdinaryParameter;
import org.emftext.language.java.parameters.Parameter;
import org.emftext.language.java.types.ClassifierReference;
import org.emftext.language.java.types.NamespaceClassifierReference;
import org.emftext.language.java.types.Type;
import org.emftext.language.java.types.TypeReference;
import org.kardo.language.aspectj.patterns.TypePattern;
import org.kardo.language.ipc.generator.AspectJPrinterSub;
import org.kardo.language.ipc.generator.GeneratorMain;
import org.kardo.language.ipc.resource.ipc.IIpcTextResource;
import org.kardo.language.ipc.resource.ipc.analysis.ClassifierReferenceTargetReferenceResolver;

@SuppressWarnings("all")
public class Utility {
  private static ClassifierReferenceTargetReferenceResolver refResolver = new Function0<ClassifierReferenceTargetReferenceResolver>() {
    public ClassifierReferenceTargetReferenceResolver apply() {
      ClassifierReferenceTargetReferenceResolver _classifierReferenceTargetReferenceResolver = new ClassifierReferenceTargetReferenceResolver();
      return _classifierReferenceTargetReferenceResolver;
    }
  }.apply();
  
  private static ByteArrayOutputStream output = new Function0<ByteArrayOutputStream>() {
    public ByteArrayOutputStream apply() {
      ByteArrayOutputStream _byteArrayOutputStream = new ByteArrayOutputStream();
      return _byteArrayOutputStream;
    }
  }.apply();
  
  private static AspectJPrinterSub printer = new Function0<AspectJPrinterSub>() {
    public AspectJPrinterSub apply() {
      AspectJPrinterSub _aspectJPrinterSub = new AspectJPrinterSub(Utility.output, ((IIpcTextResource) GeneratorMain.resource));
      return _aspectJPrinterSub;
    }
  }.apply();
  
  public static String generateImports(final List<Import> imports) {
    try {
      String impstr = "import java.util.WeakHashMap;\n import org.alia4j.*;\n";
      for (final Import i : imports) {
        {
          Utility.printer.print(i);
          String _string = Utility.output.toString();
          String _plus = (impstr + _string);
          impstr = _plus;
          Utility.output.reset();
        }
      }
      return impstr;
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected static String _parameterExpand(final EList<Parameter> params) {
    String ps = "";
    int _size = params.size();
    boolean _equals = (_size == 0);
    if (_equals) {
      System.out.println("[GENERATOR] Parameter Expand: No Parameters found");
    } else {
      int _size_1 = params.size();
      boolean _equals_1 = (_size_1 == 1);
      if (_equals_1) {
        Parameter _get = params.get(0);
        String _parameterExpand = Utility.parameterExpand(_get);
        String _plus = (ps + _parameterExpand);
        ps = _plus;
      } else {
        Parameter par = IterableExtensions.<Parameter>last(params);
        Parameter _last = IterableExtensions.<Parameter>last(params);
        params.remove(_last);
        for (final Parameter p : params) {
          String _parameterExpand_1 = Utility.parameterExpand(p);
          String _plus_1 = (ps + _parameterExpand_1);
          String _plus_2 = (_plus_1 + ", ");
          ps = _plus_2;
        }
        String _parameterExpand_2 = Utility.parameterExpand(par);
        String _plus_3 = (ps + _parameterExpand_2);
        ps = _plus_3;
      }
    }
    return ps;
  }
  
  protected static String _parameterExpand(final OrdinaryParameter param) {
    String p = "";
    TypeReference _typeReference = param.getTypeReference();
    if ((_typeReference instanceof NamespaceClassifierReference)) {
      TypeReference _typeReference_1 = param.getTypeReference();
      NamespaceClassifierReference tr = ((NamespaceClassifierReference) _typeReference_1);
      EList<ClassifierReference> _classifierReferences = tr.getClassifierReferences();
      ClassifierReference _get = _classifierReferences.get(0);
      String _resolveReference = Utility.resolveReference(_get);
      String _plus = (p + _resolveReference);
      String _plus_1 = (_plus + " ");
      String _name = param.getName();
      String _plus_2 = (_plus_1 + _name);
      p = _plus_2;
    }
    return p;
  }
  
  protected static String _resolveReference(final ClassifierReference ref) {
    Classifier _target = ref.getTarget();
    return Utility.refResolver.deResolve(_target, ref, null);
  }
  
  protected static String _resolveReference(final TypeReference ref) {
    String s = null;
    ClassifierReference _pureClassifierReference = ref.getPureClassifierReference();
    boolean _equals = Objects.equal(_pureClassifierReference, null);
    if (_equals) {
      Type _target = ref.getTarget();
      String _string = _target.toString();
      s = _string;
    } else {
      ClassifierReference _pureClassifierReference_1 = ref.getPureClassifierReference();
      Classifier _target_1 = _pureClassifierReference_1.getTarget();
      ClassifierReference _pureClassifierReference_2 = ref.getPureClassifierReference();
      String _deResolve = Utility.refResolver.deResolve(_target_1, _pureClassifierReference_2, null);
      s = _deResolve;
    }
    return s;
  }
  
  protected static String _resolveReference(final TypePattern ref) {
    TypeReference _type = ref.getType();
    ClassifierReference _pureClassifierReference = _type.getPureClassifierReference();
    Classifier _target = _pureClassifierReference.getTarget();
    TypeReference _type_1 = ref.getType();
    ClassifierReference _pureClassifierReference_1 = _type_1.getPureClassifierReference();
    return Utility.refResolver.deResolve(_target, _pureClassifierReference_1, null);
  }
  
  public static EObject resolveReference(final InternalEObject ref, final Resource resource) {
    URI _eProxyURI = ref.eProxyURI();
    String _fragment = _eProxyURI.fragment();
    return resource.getEObject(_fragment);
  }
  
  public static String parameterExpand(final Object param) {
    if (param instanceof OrdinaryParameter) {
      return _parameterExpand((OrdinaryParameter)param);
    } else if (param instanceof EList) {
      return _parameterExpand((EList<Parameter>)param);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(param).toString());
    }
  }
  
  public static String resolveReference(final Commentable ref) {
    if (ref instanceof TypePattern) {
      return _resolveReference((TypePattern)ref);
    } else if (ref instanceof ClassifierReference) {
      return _resolveReference((ClassifierReference)ref);
    } else if (ref instanceof TypeReference) {
      return _resolveReference((TypeReference)ref);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(ref).toString());
    }
  }
}
