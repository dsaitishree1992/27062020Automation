package Oops.polymorphism;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloading obj= new MethodOverloading();
		obj.sum(10,20,30);
		obj.sum(10,20);

	}
	
	public int sum(int a , int b)
	{
		return(a+b);
	}
	public int sum(int a , int b, int c)
	{
		return(a+b+c);
	}

}
