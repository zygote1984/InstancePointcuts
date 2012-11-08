package org.kardo.language.ipc.generator;

import com.google.common.collect.Iterators;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.emftext.language.java.classifiers.ConcreteClassifier;
import org.kardo.language.aspectj.commons.impl.AspectJCompilationUnitImpl;
import org.kardo.language.ipc.Ipc;
import org.kardo.language.ipc.generator.AspectJCompilationUnitGenerator;
import org.kardo.language.ipc.generator.FileCreator;
import org.kardo.language.ipc.generator.GeneratorInitializer;

@SuppressWarnings("all")
public class GeneratorMain {
  private AspectJCompilationUnitGenerator ajgen;
  
  public static HashMap<String,Ipc> ipcRegistry = new Function0<HashMap<String,Ipc>>() {
    public HashMap<String,Ipc> apply() {
      HashMap<String,Ipc> _hashMap = new HashMap<String,Ipc>();
      return _hashMap;
    }
  }.apply();
  
  private boolean print;
  
  public GeneratorMain(final boolean print) {
    this.print = true;
  }
  
  public static Resource resource = null;
  
  public void doGenerate(final Resource r, final FileCreator fsa) {
    GeneratorMain.resource = r;
    EcoreUtil.resolveAll(GeneratorMain.resource);
    AspectJCompilationUnitGenerator _aspectJCompilationUnitGenerator = new AspectJCompilationUnitGenerator();
    this.ajgen = _aspectJCompilationUnitGenerator;
    TreeIterator<EObject> _allContents = GeneratorMain.resource.getAllContents();
    Iterator<AspectJCompilationUnitImpl> _filter = Iterators.<AspectJCompilationUnitImpl>filter(_allContents, AspectJCompilationUnitImpl.class);
    List<AspectJCompilationUnitImpl> aspect = IteratorExtensions.<AspectJCompilationUnitImpl>toList(_filter);
    if (this.print) {
      TreeIterator<EObject> _allContents_1 = GeneratorMain.resource.getAllContents();
      Iterator<EObject> _filter_1 = Iterators.<EObject>filter(_allContents_1, EObject.class);
      List<EObject> _list = IteratorExtensions.<EObject>toList(_filter_1);
      for (final EObject o : _list) {
        String _plus = ("[GENERATOR]: Aspect Contents :" + o);
        System.out.println(_plus);
      }
    }
    for (final AspectJCompilationUnitImpl k : aspect) {
      {
        this.ajgen.setAspect(k);
        String packageName = "";
        URI _outputPath = GeneratorInitializer.getOutputPath();
        String _string = _outputPath.toString();
        String outputPath = (_string + "/");
        String _string_1 = outputPath.toString();
        String _plus_1 = ("[GENERATOR MAIN]" + _string_1);
        System.out.println(_plus_1);
        FileCreator.instance.setOutputPath(outputPath);
        EList<ConcreteClassifier> _classifiers = k.getClassifiers();
        ConcreteClassifier _get = _classifiers.get(0);
        String _name = _get.getName();
        String _plus_2 = (_name + ".aj");
        CharSequence _compileUnit = this.ajgen.compileUnit();
        FileCreator.instance.generateFile(_plus_2, _compileUnit);
      }
    }
  }
}
