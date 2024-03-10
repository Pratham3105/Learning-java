
// variable hiding

class Employee12
{
	int salary = 500000; // this variable will be hide 
}
class Programmer1 extends Employee12
{
	int salary = 10000000;
	void show ()
	{
		System.out.println("Salary id : "+salary);
	}
}
public class VariableHidingDemo {

	public static void main(String[] args) {
		
		Programmer1 t = new Programmer1();
		t.show();

	}

}
