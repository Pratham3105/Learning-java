class MyRunnable2 extends Thread
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
public class ExtendingThreadDemo {

	public static void main(String[] args) {
		
		//Thread t1 = new Thread(new MyRunnable());
		
		MyRunnable2 m1 = new MyRunnable2();
		MyRunnable2 m2 = new MyRunnable2();
		MyRunnable2 m3 = new MyRunnable2();
		
		m1.start();
		m2.start();
		m3.start();
	}
}
