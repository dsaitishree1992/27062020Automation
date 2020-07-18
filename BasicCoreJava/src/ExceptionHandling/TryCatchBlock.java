package ExceptionHandling;

public class TryCatchBlock {

	public static Functions fun;

	public static void main(String[] args) {
		
		//Step1 :Verify about Link is present
		 try {
			
		  int a=10; 
		  int b=0; 
		  System.out.println(a/b);
		 }catch (Exception e) {
			 System.out.println("Excetion occured:" + e.getMessage());
		 }
		 
		
		//Step2 :- Verify Download link is Present
		 try {
		  String[] str=new String[2];
		  str[2]= "Anand";
		 }catch (Exception e) {
			 System.out.println("Exception occured:" + e.getMessage());
		 }
		 
	
		//Step 3: Verify project link is present
		
		fun.fun1();
		
		
	
	}
}
