class Car1
{
	int speed;
	{
		speed=400;
		System.out.println(speed);
	}
	void show()
	{
		speed=20;
		System.out.println(speed);
		
	}
}
public class InstanceInitializerDemo2 {

	public static void main(String[] args) {
		
		Car1 t = new Car1();
		t.show();
	}

}
