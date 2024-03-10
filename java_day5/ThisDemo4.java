class Employee
{
	int empid;
	String name;
	String post;
	int salary;
	
	Employee(int empid,String name,String post)
	{
		this.empid=empid;
		this.name=name;
		this.post=post;
	}
	
	Employee(int empid,String name,String post,int salary)
	{
		this(empid, name, post);
		this.salary=salary;
	}
	void display()
	{
		System.out.println(empid+" "+name+" "+post+" "+salary);
	}
}
public class ThisDemo4 {

	public static void main(String[] args) {
		Employee t =new Employee(101,"rahul","engineer",1500000);
		t.display();
		

	}

}
