class student1 
{
	int rollno;
	String name;
	double fee;
	
	student1(int rollno,String name,double fee)
	{
		this.rollno = rollno;
		this.name = name ;
		this.fee = fee;
	}
	void display() 
	{
		System.out.println(rollno+" "+name+" "+fee);
	}
}
public class ThisDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student1 t=new student1(101,"raj",70000.00);
		student1 p=new student1(102,"prashant",60000.00);
		student1 r=new student1(103,"pratham",50000.00);
	
		t.display();
		p.display();
		r.display();
	}

}
