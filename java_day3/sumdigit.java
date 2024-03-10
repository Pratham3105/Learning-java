class sumdigit 
{
	public static void main(String args[])
	{
		int num = 123;
		int r;
		int sum =0;
		while(num!=0)
		{
			r=num%10;
			sum = sum + r;
			num = num/10;
			
		}
		System.out.println(sum);
		
	}
}