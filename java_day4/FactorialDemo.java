import java.util.Scanner;
public class FactorialDemo {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		int i;
		int fact=1;
		for(i=1;i<=num;i++)
		{
			fact=fact*i;
		}

		System.out.println("Factorial is: "+fact);
	}

}
