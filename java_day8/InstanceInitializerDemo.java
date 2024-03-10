class Bike1
{
	int a[];
	{
		// instance initializer block
		a = new int[3];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		for(int i=0;i<3;i++)
		{
			System.out.println(a[i]);
		}
	}
	
}


public class InstanceInitializerDemo {

	public static void main(String[] args) {
		
		Bike1 t = new Bike1();

	}

}
