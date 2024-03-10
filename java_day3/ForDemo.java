class ForDemo
{
	public static void main(String args[])
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);		
		}
	
		int n=6;
		for(int i=0;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.println("* ");
			}
		}
	}
} 