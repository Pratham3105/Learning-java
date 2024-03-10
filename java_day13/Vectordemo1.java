import java.util.*;
public class Vectordemo1 {

	public static void main(String[] args) {
		
		Vector<Integer> v1 = new Vector<Integer>();
		v1.add(10);
		v1.addElement(20);
		v1.addElement(30);
		v1.addElement(40);
		v1.addElement(20);
		v1.addElement(20);
	
	
		
		
		System.out.println(v1);
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		

		

	}

}
