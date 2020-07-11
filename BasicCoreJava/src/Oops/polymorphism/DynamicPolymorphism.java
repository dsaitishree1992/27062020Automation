package Oops.polymorphism;

import Inheritance.Mobiles;
import Inheritance.Smartphone;
import Inheritance.Telephone;

public class DynamicPolymorphism {

	public static void main(String[] args) {
		
		/*
		 * Telephone obj4; //web driver
		 * 
		 * obj4= new Telephone(); obj4.calling();
		 * 
		 * obj4= new Mobiles();  obj4.calling();  //chrome driver
		 * 
		 * obj4= new Smartphone();  obj4.calling(); //firefox driver
		 */
		
		
		Telephone obj4=null;
		
		String browserName= "chrome";
		
		if(browserName.equals("chrome"))
		{
			obj4= new Mobiles();
		}else if(browserName.equals("firefox"))
		{
			obj4= new Smartphone ();
		}
		
	   obj4.calling();
		
		
	}

}
