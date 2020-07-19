package StringClass;

public class Assignment {

	public static void main(String[] args) {


		//How many a is present
		
		String str ="anand";
		
		/*
		 * int count= 0;
		 * 
		 * for(int iter=0; iter<str.length(); iter++) { if(str.charAt(iter)=='a' ||
		 * str.charAt(iter)== 'A') { count++; } } System.out.println(count);
		 */
	
	String[] arr=str.split("");
	System.out.println(arr.length);
	
	int count=0;
	for(String c:arr)
	{
		if(c.equals("a"))
		count++;
	}
	System.out.println("Total number of a=" +count);
	
	}
	

}
