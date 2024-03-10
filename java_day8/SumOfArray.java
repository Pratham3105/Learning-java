import java.util.Scanner;
public class SumOfArray {

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
		System.out.println("Sum of the array : ");
		int sum =0;
		for(int i=0;i<Size;i++)
		{
			sum = sum + DyArray[i];
			
		}
		System.out.println(sum);

	}

}
