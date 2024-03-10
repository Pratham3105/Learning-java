class pt extends Thread
{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println("Hello Pratham");
			System.out.println("Hello Global");
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
	}
}
public class RunnableDemo3 {

	public static void main(String[] args) {
		
		pt t1 = new pt();
		pt t2 = new pt();
		pt t3 = new pt();
		
		t1.start();
		t2.start();
		t3.start();
		
		
		
	}

}
