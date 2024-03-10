// write a java program to count a frequency of  character in  the given string
// import java.util.Scanner;
public class StringDemo5 {

	public static void main(String[] args) {
		
		String s1 = "My India";
		String s2 = s1.toUpperCase();
		System.out.println(s2);
		// Scanner t = new Scanner(System.in);
		// int ch1 = t.nextInt();
		
		int Count =0;
		for(int i=0;i<s2.length();i++)
		{
			if(s2.charAt(i)=='I')
			{
				Count++;
			}
		}
		System.out.println("Frequency of I is : "+Count);
		
		
	}

}
