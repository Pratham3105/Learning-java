import java.util.Scanner;
public class SortArray {

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
		int index;
		for(int i=0;i<Size-1;i++)
		{
			index=i;
			for(int j=i+1;j<Size;j++)
			{
				if(DyArray[j]<DyArray[index])
				{
					index=j;
				}
			}
			int temp = DyArray[i];
			DyArray[i]=DyArray[index];
			DyArray[index]=temp;
			
		}
		
		System.out.println("Elements of the sorted array");
		for(int i=0;i<Size;i++)
		{
			System.out.println(DyArray[i]);
		}
		
		/*
		 for(int i=0;i<Size;i++)
		 {
			 for(int j=i+1;j<Size;j++)
			 {
				 if(DyArray[i]>DyArray[j])
				 {
					 int temp = DyArray[i];
					 DyArray[i]=DyArray[j];
					 DyArray[j]=temp;
					 
				 }
			 }
		 }
		 */
		 	
		 
		

	}

}