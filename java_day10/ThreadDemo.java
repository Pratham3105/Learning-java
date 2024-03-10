
// default priority
public class ThreadDemo {

	public static void main(String[] args) {
		
		Thread t = Thread.currentThread();
		System.out.println("Main thread is : "+t);
		t.setName("My Global Thread");
		System.out.println("After name changed : "+t);
		t.setPriority(8);
		System.out.println("After priority change : "+t);

	}

}
