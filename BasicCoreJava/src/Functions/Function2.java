package Functions;

public class Function2 {

	public static String name="anand";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		sum(10,20);
		sum(20,30);
		sum(40,50);
		sum(10,20,30);
		message("anand");
		eligibility("Anand" ,32);
		eligibility("abc" , 17);
		
		System.out.println(name);

	}
	

	public static void sum(int a, int b)
	{
		System.out.println(a+b);
	}
	
	public static void sum(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
	public static void message(String name)
	{
		System.out.println("Welcome " + name);
	}
	
	public static void eligibility(String name, int age )
	{
		//put some logic
		System.out.println("Anand, your are eligible");
		System.out.println("Prachi, you are not eligible");
	}
	
}
