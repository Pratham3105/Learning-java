import java.util.Scanner;
public class LinearSearch {

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
		System.out.println("enter any number for searching");
		int num;
		num = sc.nextInt();
		boolean flag = false;
		for(int i=0;i<Size;i++)
		{
			if(DyArray[i]==num)
			{
				System.out.println("number present at the index : "+i);
				flag = true;
				break;
			}
			
		}
		if(flag==false)
		{
			System.out.println("Element not found");
		}
		
	}

}
