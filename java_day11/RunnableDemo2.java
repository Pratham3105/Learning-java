
class MyRunnable1 implements Runnable
{
	public void run() // functionality of thread
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
public class RunnableDemo2 {

	public static void main(String[] args) {
		
		//Thread t1 = new Thread(new MyRunnable());
		
		MyRunnable1 m1 = new MyRunnable1();
		//m1.run();
		Thread t1 = new Thread(m1);
		Thread t2 = new Thread(m1);
		Thread t3 = new Thread(m1);
		t1.start();
		try
		{
		t1.start();
		}
		catch(IllegalThreadStateException e)
		{
			System.out.println(e);
		}
		t2.start();
		t3.start();
	}
}