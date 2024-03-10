class table 
{
	synchronized void PrintTable(int number)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Table of "+number+" : "+number*i);
		
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
class MyThread_1 extends Thread
{
	table t;
	MyThread_1(table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.PrintTable(2);
	}
}

class MyThread_2 extends Thread
{
	table t;
	MyThread_2(table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.PrintTable(5);
	}
}

public class synchDemo {

	public static void main(String[] args) {
		
		table t = new table();
		MyThread_1 t1 = new MyThread_1(t);
		MyThread_2 t2 = new MyThread_2(t);
		
		t1.start();
		t2.start();
				
	}

}
