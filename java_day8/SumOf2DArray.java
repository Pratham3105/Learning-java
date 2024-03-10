
public class SumOf2DArray {

	public static void main(String[] args) {
		
		int a[][]= {{10,20},{30,40},{50,60},{70,80}};
		int sum=0;
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<2;j++)
			{
				sum = sum +a[i][j];
				
			}
		}
		System.out.print("sum of the 2D array element is :"+sum);

	}

}
