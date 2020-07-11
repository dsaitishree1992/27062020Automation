package JavaprogramminPracticeif;

public class Ifelsestatement {

	public static void main(String[] args) {
		int year=2020;
		
		if(((year%4==0) && (year%100 !=0)) || (year % 400==0))
			
		{
			System.out.println("Leap Year");
		}
		else
		{
			System.out.println("Common Year");
		}
		
		int number=12;
		//Using Ternary operator
		
		String output=(number%2==0)?"Even number":"Odd number";
		System.out.println(output);

	}

}
