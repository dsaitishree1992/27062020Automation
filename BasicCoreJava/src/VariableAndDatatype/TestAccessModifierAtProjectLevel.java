package VariableAndDatatype;

import Functions.AccessModifiers; //import function added

public class TestAccessModifierAtProjectLevel extends AccessModifiers{

	public static void main(String[] args) {
		AccessModifiers Obj=new AccessModifiers();
		Obj.publicFunction();
		
		//you can access at project level by using child class object
		
		TestAccessModifierAtProjectLevel obj2= new TestAccessModifierAtProjectLevel();
		obj2.protectedFunction();
		
	}

}
