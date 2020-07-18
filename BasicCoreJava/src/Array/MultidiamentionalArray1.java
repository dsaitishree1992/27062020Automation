package Array;

public class MultidiamentionalArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] data= new String[7][10];
		
		data[0][0] ="1";
		data[0][1] ="2";
		data[0][2] ="3";
		data[0][3] ="4";
		data[0][4] ="5";
		data[0][5] ="6";
		data[0][6] ="7";
		data[0][7] ="8";
		data[0][8] ="9";
		data[0][9] ="10";
		
		data[1][0] ="1";
		data[0][1] ="2";
		data[0][2] ="3";
		data[0][3] ="4";
		data[0][4] ="5";
		data[0][5] ="6";
		data[0][6] ="7";
		data[0][7] ="8";
		data[0][8] ="9";
		data[0][9] ="10";
		
		for (int r=0; r< data.length; r++)
		{
			for (int c=0; c<data[r].length; c++)
			{
				System.out.print(data[r][c]+ " ");
			
			}
			System.out.println();
		}
		
		

	}

}
