import java.util.Scanner;
public class MaxElement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array");
		int Size = sc.nextInt();
		int DyArray[]=new int[Size];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<Size;i++)
		{
			System.out.println("Enter the element at the index "+i+":");
			DyArray[i]=sc.nextInt();
		}
		System.out.println("Elements of the array");
		for(int i=0;i<Size;i++)
		{
			System.out.println(DyArray[i]);
		}
		System.out.println("Max element of the array : ");
		int max=DyArray[0];
		for(int i=0;i<Size;i++)
		{
			if(DyArray[i]>max)
			{
				max = DyArray[i];
			}
			
		}
		System.out.println(max);

	}

}
