package Functions;

public class Car {

	String colour;
	int capacity ;
	
	public void features()
	{
		System.out.println("car features are. colour="+colour+",and capacity ="+capacity);
	}
	
	public Car(String colour ,int capacity  )
	{
		this.colour = colour;
	    this.capacity=capacity;
	}
	
	public Car()  //default constructor //constructor overloading
	{
		
	}
	
}
