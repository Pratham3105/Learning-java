class MyString
{
	 //synchronized void PrintMyString(String str)
	 void PrintMyString(String str)
	{
		System.out.print("["+str);
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException e) 
		{
			System.out.println(e);
		}
		System.out.println("]");
	}
}
class MyThread_11 extends Thread
{
	MyString t;
	String str;
	MyThread_11(MyString t , String str)
	{
		this.t=t;
		this.str=str;
	}
	public void run()
	{
		synchronized (t) // second way
		{
		t.PrintMyString(str);
		}
	}
}
public class SyncDemo3 {

	public static void main(String[] args) {
		
		MyString t = new MyString();
		MyThread_11 t1 =new MyThread_11(t,"Hello");
		MyThread_11 t2 =new MyThread_11(t,"Pratham");
		MyThread_11 t3 =new MyThread_11(t,"Global");
		t1.start();
		t2.start();
		t3.start();
		

	}

}
