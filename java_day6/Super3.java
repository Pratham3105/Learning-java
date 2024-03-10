class Accountpt 
{
	Accountpt(int balance)
	{
		System.out.println("Your balace is : "+balance);
	}
}

class FlexiAccount extends Accountpt 
{
	
	FlexiAccount(int balance , int tenure)
	{
		super(20000); // for call parent class/ base class constructor
		System.out.println("Your balance in FlexiAccount : "+balance);
		System.out.println("Your tenure : "+tenure);
		
	}
}

public class Super3 {

	public static void main(String[] args) {
	
		FlexiAccount t = new FlexiAccount(500000,2);

	}

}
