class Employee1 // Base class
{
	int salary = 100000;
}
// extends keyword is used to inherit class  
class Programmer extends Employee1 // derived class , subclass , child class
{
	int bonus = 5000;
}
public class InheritanceDemo1 {

	public static void main(String[] args) {
		Programmer t = new Programmer();
		System.out.println(t.salary+ " "+t.bonus);

	}

}
