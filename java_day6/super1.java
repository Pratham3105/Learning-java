
// variable hiding

class Employee123
{
	int salary = 500000; // this variable will be hide 
}
class Programmer11 extends Employee123
{
	int salary = 10000000;
	void show ()
	{
		System.out.println("Salary id : "+super.salary);
		// with super keyword we print variable of imidiate parent class 
		// in super keyword . it have parent class variable reference
		// referece == pointer
		System.out.println("Salary id : "+salary);
	}
}
public class super1 {

	public static void main(String[] args) {
		
		Programmer11 t = new Programmer11();
		t.show();

	}

}
