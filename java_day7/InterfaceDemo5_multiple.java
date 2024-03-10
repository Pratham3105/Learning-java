interface Bike
{
	void run();
}
interface Car
{
	void run();
}
class Race implements Bike,Car
{
	public void run() {
		System.out.println("RUN1");
	}
}
public class InterfaceDemo5_multiple {

	public static void main(String[] args) {
		
		Race t = new Race();
		t.run();
	}

}
