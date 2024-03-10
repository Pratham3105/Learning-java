import java.util.Scanner;
public class TwoDArrayInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No. of Rows");
		int m = sc.nextInt();
		System.out.println("Enter No. of Column");
		int n = sc.nextInt();
		System.out.println("Enter the element of the 2D array");
		int ad[][]= new int[m][n];
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.println("Enter element at the position : "+i+" "+j+":");
				ad[i][j]=sc.nextInt();
				
			}
		}
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(ad[i][j]+" ");
			}
			System.out.println();
		}


	}

}
