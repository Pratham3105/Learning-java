
class MyMethod1
{
	
	
	static void show()
	{
		System.out.println("Hello"); // in static method can access only static variable 
	}
	void display()
	{
		System.out.println("Hello World");
	}
	
	
}
public class StaticVarDemo2 {
	
	static int b=10;
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			System.out.println(b);
			MyMethod1.show();
			// for static method don't need for object for calling 
			MyMethod1 t=new MyMethod1();
			t.display();
//			 for normal method  need for object for calling 
			
	}

}
