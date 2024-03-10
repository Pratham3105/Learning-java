class MyRunnable implements Runnable
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Child Thread : "+i);
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
public class RunnableDemo {

	public static void main(String[] args) {
		
		//Thread t1 = new Thread(new MyRunnable());
		
		MyRunnable m1 = new MyRunnable();
		Thread t1 = new Thread(m1);
		//Thread t2 = new Thread(m1);
		t1.start();   //t1.run();
		//t2.start();
		for(int i=1;i<=10;i++)
		{
			System.out.println("Main Thread : "+i);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
		
		
		

	}

}
