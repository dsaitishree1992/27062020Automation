package ExceptionHandling;

public class FinallyKeyword {

	public static void main(String[] args) {
		
		try {
			System.out.println("Disconnect the machine from internet");
			System.out.println("Verify that ######### message is displayed");
			System.out.println(10/0);
			//System.out.println("connect the machine to internet");
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
			//System.out.println("connect the machine to internet");
		}finally {
			System.out.println("connect the machine to internet");
		}

	}

}
