
public class ThreadDemo3 {

	public static void main(String[] args) {
		
		int rows =10;
		for(int i=1;i<=rows;i++)
		{
			System.out.println(" ");
			for(int j=rows;j>=1;j--)
			{
				System.out.print("");
			}
			for(int k=1;k<=rows;k++)
			{
				System.out.print("* ");
			}
			
			System.out.print("");
		}

	}

}
