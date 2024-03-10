abstract class Bank
{
	abstract int getInterest(); // any abstract method or class can't be final
}

class SBI extends Bank
{
	int getInterest()
	{
		return 7;
	}
}
class PNB extends Bank
{
	int getInterest()
	{
		return 8;
	}
}
public class AbstractDemo2 {

	public static void main(String[] args) {
		
		SBI t1 = new SBI();
		PNB t2 = new PNB();
		
		System.out.println("Rate of Interest (SBI) : "+t1.getInterest());
		System.out.println("Rate of Interest (PNB) : "+t2.getInterest());
		
	}

}
