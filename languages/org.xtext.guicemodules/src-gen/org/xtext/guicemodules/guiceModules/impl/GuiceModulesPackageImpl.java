/**
 */
package org.xtext.guicemodules.guiceModules.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xtext.common.types.TypesPackage;

import org.eclipse.xtext.xbase.XbasePackage;

import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotationsPackage;

import org.eclipse.xtext.xtype.XtypePackage;

import org.xtext.guicemodules.guiceModules.BindingAST;
import org.xtext.guicemodules.guiceModules.GuiceModulesFactory;
import org.xtext.guicemodules.guiceModules.GuiceModulesPackage;
import org.xtext.guicemodules.guiceModules.KeyAST;
import org.xtext.guicemodules.guiceModules.ModuleAST;
import org.xtext.guicemodules.guiceModules.ModulesAST;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GuiceModulesPackageImpl extends EPackageImpl implements GuiceModulesPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modulesASTEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass moduleASTEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bindingASTEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass keyASTEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.xtext.guicemodules.guiceModules.GuiceModulesPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private GuiceModulesPackageImpl()
  {
    super(eNS_URI, GuiceModulesFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link GuiceModulesPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static GuiceModulesPackage init()
  {
    if (isInited) return (GuiceModulesPackage)EPackage.Registry.INSTANCE.getEPackage(GuiceModulesPackage.eNS_URI);

    // Obtain or create and register package
    GuiceModulesPackageImpl theGuiceModulesPackage = (GuiceModulesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GuiceModulesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GuiceModulesPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    XAnnotationsPackage.eINSTANCE.eClass();
    XbasePackage.eINSTANCE.eClass();
    XtypePackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theGuiceModulesPackage.createPackageContents();

    // Initialize created meta-data
    theGuiceModulesPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theGuiceModulesPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(GuiceModulesPackage.eNS_URI, theGuiceModulesPackage);
    return theGuiceModulesPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModulesAST()
  {
    return modulesASTEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModulesAST_ImportSection()
  {
    return (EReference)modulesASTEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModulesAST_Modules()
  {
    return (EReference)modulesASTEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModuleAST()
  {
    return moduleASTEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModuleAST_Name()
  {
    return (EAttribute)moduleASTEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModuleAST_Mixins()
  {
    return (EReference)moduleASTEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModuleAST_Bindings()
  {
    return (EReference)moduleASTEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBindingAST()
  {
    return bindingASTEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBindingAST_From()
  {
    return (EReference)bindingASTEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBindingAST_To()
  {
    return (EReference)bindingASTEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBindingAST_ToInstance()
  {
    return (EReference)bindingASTEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getKeyAST()
  {
    return keyASTEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getKeyAST_Annotation()
  {
    return (EReference)keyASTEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getKeyAST_Type()
  {
    return (EReference)keyASTEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GuiceModulesFactory getGuiceModulesFactory()
  {
    return (GuiceModulesFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modulesASTEClass = createEClass(MODULES_AST);
    createEReference(modulesASTEClass, MODULES_AST__IMPORT_SECTION);
    createEReference(modulesASTEClass, MODULES_AST__MODULES);

    moduleASTEClass = createEClass(MODULE_AST);
    createEAttribute(moduleASTEClass, MODULE_AST__NAME);
    createEReference(moduleASTEClass, MODULE_AST__MIXINS);
    createEReference(moduleASTEClass, MODULE_AST__BINDINGS);

    bindingASTEClass = createEClass(BINDING_AST);
    createEReference(bindingASTEClass, BINDING_AST__FROM);
    createEReference(bindingASTEClass, BINDING_AST__TO);
    createEReference(bindingASTEClass, BINDING_AST__TO_INSTANCE);

    keyASTEClass = createEClass(KEY_AST);
    createEReference(keyASTEClass, KEY_AST__ANNOTATION);
    createEReference(keyASTEClass, KEY_AST__TYPE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    XtypePackage theXtypePackage = (XtypePackage)EPackage.Registry.INSTANCE.getEPackage(XtypePackage.eNS_URI);
    XbasePackage theXbasePackage = (XbasePackage)EPackage.Registry.INSTANCE.getEPackage(XbasePackage.eNS_URI);
    XAnnotationsPackage theXAnnotationsPackage = (XAnnotationsPackage)EPackage.Registry.INSTANCE.getEPackage(XAnnotationsPackage.eNS_URI);
    TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(modulesASTEClass, ModulesAST.class, "ModulesAST", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModulesAST_ImportSection(), theXtypePackage.getXImportSection(), null, "importSection", null, 0, 1, ModulesAST.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModulesAST_Modules(), this.getModuleAST(), null, "modules", null, 0, -1, ModulesAST.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(moduleASTEClass, ModuleAST.class, "ModuleAST", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getModuleAST_Name(), ecorePackage.getEString(), "name", null, 0, 1, ModuleAST.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModuleAST_Mixins(), this.getModuleAST(), null, "mixins", null, 0, -1, ModuleAST.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModuleAST_Bindings(), this.getBindingAST(), null, "bindings", null, 0, -1, ModuleAST.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bindingASTEClass, BindingAST.class, "BindingAST", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBindingAST_From(), this.getKeyAST(), null, "from", null, 0, 1, BindingAST.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBindingAST_To(), this.getKeyAST(), null, "to", null, 0, 1, BindingAST.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBindingAST_ToInstance(), theXbasePackage.getXExpression(), null, "toInstance", null, 0, 1, BindingAST.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(keyASTEClass, KeyAST.class, "KeyAST", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getKeyAST_Annotation(), theXAnnotationsPackage.getXAnnotation(), null, "annotation", null, 0, 1, KeyAST.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getKeyAST_Type(), theTypesPackage.getJvmTypeReference(), null, "type", null, 0, 1, KeyAST.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //GuiceModulesPackageImpl
