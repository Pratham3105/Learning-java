
public class StringDemo9 {

	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = "Global";
		String s3 = "Hello";
		String s4 = new String("Hello");
		
		if(s1.equals(s3)) // == compares the references
		{
			System.out.println("Same String");
		}
		else 
		{
			System.out.println("Not Same");
		}
		
		if(s1==s4) 
		{
			System.out.println("Same String");
		}
		else 
		{
			System.out.println("Not Same");
		}
		
		if(s1==s3) 
		{
			System.out.println("Same String");
		}
		else 
		{
			System.out.println("Not Same");
		}
		
		
	}

}
