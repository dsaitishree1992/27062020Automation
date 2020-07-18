package ExceptionHandling;

public class TryCatchBlock2 {

	public static Functions fun;

	public static void main(String[] args) {
		
		try {
		//Step1 :click on Download link
		  int a=10; 
		  int b=2; 
		  System.out.println(a/b);
		 
		
		//Step2 :- click on latest stable version
		 
		  String[] str=new String[2];
		  str[1]= "Anand";
		 
	
		//Step 3: Verify project link is present
		
		fun.fun1();
		}catch (ArithmeticException e) {
			System.out.println("ArithmeticException Occrured:" +e.getMessage());
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException Occrured:" +e.getMessage());
		}
		catch (NullPointerException e) {
			System.out.println("NullPointerException Occrured:" +e.getMessage());
		}
		catch (Exception e) {
			System.out.println("Unkown Exception Occrured:" +e.getMessage());
		}
		
	
	}
}
