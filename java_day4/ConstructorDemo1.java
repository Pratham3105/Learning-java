class Area
{
	int length,width;
	Area(int l,int w)
	{
		length=l;
		width=w;
				
	}			
}
public class ConstructorDemo1 {

	public static void main(String[] args) 
	{
		 Area t=new Area(10,20);
		 int area1=t.length*t.width;
		 System.out.println(area1);

	}

}
