class pallindrome
{
	public static void main(String args[])
	{
		int n=546;
		int rev=0;
		int number=n;
		int r;
		while(n!=0)
		{
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		if(number==rev)
		{
			System.out.println("number is pallindrome");
		}
		else
		{
			System.out.println("number is not pallindrome");
		}	
	}
}