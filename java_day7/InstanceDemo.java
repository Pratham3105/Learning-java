class Student123
{
	void Exam()
	{
		System.out.println("Hello");
	}
}
class Faculty123 extends Student123
{
	void Training()
	{
		System.out.println("welcome");
	}
}
public class InstanceDemo {

	public static void main(String[] args) {
		
		Student123 t1 = new Student123();
		Faculty123 t2= new Faculty123();
		System.out.println(t1 instanceof Student123);
		System.out.println(t1 instanceof Faculty123);
		System.out.println(t2 instanceof Student123);
		System.out.println(t2 instanceof Faculty123);
	}

}