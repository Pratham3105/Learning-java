
class Area 
{
	void Rectangle(int l,int w)
	{
		int ar1 = l*w;
		System.out.println("Area of a Rectangle"+ar1);
	}
}

class AB12
{
	Area t ;
	AB12(Area t)
	{
		this.t =t;
	}
	void show()
	{
		t.Rectangle(6, 2);
	}
}

public class SyncDemo2
{
	public static void main()
	{
		Area t = new Area();
		AB12 t1 = new AB12(t);
		t1.show();
	}
}