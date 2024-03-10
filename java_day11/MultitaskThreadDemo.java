class MyThread1 extends Thread
{

	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Thread 1 : "+2*i);
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

class MyThread2 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Thread 2 : "+3*i);
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

class MyThread3 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Thread 3 : "+4*i);
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

public class MultitaskThreadDemo {

	public static void main(String[] args) {
		
		MyThread1 t1 =new MyThread1();
		MyThread2 t2 =new MyThread2();
		MyThread3 t3 =new MyThread3();
		t3.start();
		t1.start();
		try
		{
			t1.join();
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}
		t2.start();
		t2.setPriority(9);
	}

}
