class Bitwise
{
	public static void main(String args[])
	{
		
		// 15=00001111
		// 08=00001000
		//a&b=00001000  == 8
		//a|b=00001111  == 15
		//a^b=00000111  == 7
		int a=15;
		int b=8;
		System.out.println(a&b); 
		System.out.println(a|b);
		System.out.println(a^b); 
		
		
		System.out.println(21<<1);  
		// 21 = 000010101
		// 42 = 000101010 left shift by 1 <<
		

		System.out.println(8<<3);
		System.out.println(64>>3);
	}
}