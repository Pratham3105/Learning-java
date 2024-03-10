public class ThreadDemo2 {

	public static void main(String[] args) {
		
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
			
			try
			{
				Thread.sleep(100); // 1000ms = 1sec
				// signature : static void sleep(int milis) throws InterruptedException
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}

	}

}
