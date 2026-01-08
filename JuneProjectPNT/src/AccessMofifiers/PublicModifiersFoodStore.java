package AccessMofifiers;
import JavaFullClass.Method;
public class PublicModifiersFoodStore {
public static void main(String[] args) {
	//Same package
	PublicModifiersStorageWarehouse publimodifier=new  PublicModifiersStorageWarehouse();
	publimodifier.publicmodifer();
	
	// Different package
	Method ob=new Method();
	ob.addition();
		
	ProtectedModifers obj=new ProtectedModifers();
	obj.protectedModifier();
	
	// Same Package
	DefualtModifiers defaultmodifer=new DefualtModifiers();
	defaultmodifer.defaultmodifiers();
	
	// private modifiers is called by different public modifiers at the same
	// package but you can access it from different package as well
	PrivateModifiers calledPrivate=new PrivateModifiers();
	calledPrivate.calldatahidding();
	int d=calledPrivate.getI();
	System.out.println(d);
	calledPrivate.setI(60000);


}

}
