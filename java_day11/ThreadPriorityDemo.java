
class MyRunnable12 extends Thread
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
public class ThreadPriorityDemo {

	public static void main(String[] args) {
		
		MyRunnable12 t = new MyRunnable12();
		int p =t.getPriority();
		System.out.println("priority is : "+p);
		t.setPriority(9);
		int q = t.getPriority();
		System.out.println("priority is : "+q);
		
		System.out.println(t.MIN_PRIORITY);
		System.out.println(t.MAX_PRIORITY);
		System.out.println(t.NORM_PRIORITY);
		
		
	}

}
