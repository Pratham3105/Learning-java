
public class MathDemo {

	public static void main(String[] args) {
		
		int a = 100;
		int b = 250;
		int x =2;
		int y = 3;
		System.out.println("Maximum :"+Math.max(a, b));
		System.out.println("Minimum :"+Math.min(a, b));
		System.out.println("Square :"+Math.sqrt( b));
		System.out.println("Power of :"+Math.pow(x,y));
		System.out.println("log of a:"+Math.log(a));
		System.out.println("sin of a :"+Math.sin(a));
		System.out.println("cos of b :"+Math.cos(b));
		// these are static method of class math
		// so it is call with class.method
		System.out.println("PI value is :"+Math.PI);
		System.out.println("Maximum :"+Math.cosh(60));
	}

}
