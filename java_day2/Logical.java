class Logical
{
	public static void main(String args[])
	{
		int a=20;
		int b=30;
		int c=20;
		System.out.println((a==b)&&(a<c));
		System.out.println((a==c)&&(a<=c));
		System.out.println((a<b)||(a==c));	
		System.out.println(!(a==c));
	}
}