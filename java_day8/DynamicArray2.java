import java.util.Scanner;
public class DynamicArray2 {

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
		

	}

}
