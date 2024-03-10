class NestedDemo
{
	public static void main(String args[])
	{
		int age=25;
		int weight =48;
		if(age>=18)
		{
			if(weight>50)
			{
				System.out.println("You are elligible to donate blood");
			}
			else
			{
				System.out.println("You are not elligible to donate blood");
			}
		}
		else
		{
			System.out.println("you are not elligible to donate blood");
		}
	}
} 