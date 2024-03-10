class student
{
	int rollno;
	String name;
	static String college ="Global";

		void enter(int r,String n)
		{
			rollno = r;
			name = n;
		}
		void display()
		{
			System.out.println(rollno+" "+name+" "+college);
		}
		static 
		{
			college = "IIT Bombay";
		}
}
public class TestStaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student t=new student();
		student p=new student();
		student a=new student();
		t.enter(100,"pratham");
		p.enter(101,"raj");
		a.enter(102,"prashant");
		t.display();
		p.display();
		a.display();
		

	}

}
