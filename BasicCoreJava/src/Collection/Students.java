package Collection;

import Inheritance.Mobiles;
import Inheritance.Smartphone;
import Inheritance.Telephone;

public class Students {

	public static void main(String[] args) {
		
		String name ="anand";
		String[] std=new String[18];
		
		//10, true,anand //array
		
		Object phone = new Smartphone();
		
		Object a=10;
		Object b=true;
		Object c= "anand";
		
		
		Object[] arr= new Object[3];
		arr[0]= 10;
		arr[1]= true;
		arr[2]="anand";
		
		
		new Mobiles();
		new Telephone();
		

	}

}
