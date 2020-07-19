package StringClass;

public class TestString {

	public static void main(String[] args) {
		
		String str= "Selenium";
		//1st function length()
		System.out.println(str.length());
		
		//2nd function -CharAt
		char c =str.charAt(3);
		System.out.println(c);
		//3rd function - toUpperCase
		
		System.out.println(str.toUpperCase());

		//4th Function - toLowerCase
		
		System.out.println(str.toLowerCase());
		
		//5th Function - Replace
		
		System.out.println(str.replace("len", "123"));
		
		//6th Function - SubString
		System.out.println(str.substring(4));
		
		//7th Function - SubString(beginIndex and EndIndex)
		
		System.out.println(str.substring(2,4));
		
		//8th function- Split
		
		String[] arr=str.split("len");
		
		System.out.println(arr.length);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		//9th function - Equals
		
		String str2= "selenium";
		
		System.out.println(str.equals(str2));
		
		//EqualIgnorecase
		
		System.out.println(str.equalsIgnoreCase(str2));
		
		
	}

}
