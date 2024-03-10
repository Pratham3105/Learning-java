import java.util.HashSet;

public class HasgSetDemo2 {

	public static void main(String[] args) {
		
		HashSet<Integer> pt = new HashSet<Integer>();
		pt.add(10);
		pt.add(20);
		pt.add(30);
		pt.add(40);
		pt.add(50);
		System.out.println(pt);
		pt.removeIf(n->n>30);
		System.out.println(pt);
		HashSet<Integer> pt2 = new HashSet<Integer>();
		pt2.add(10);
		pt2.add(20);
		pt2.add(30);
		
		System.out.println(pt.equals(pt2));
		int code;
		code = pt.hashCode();
		System.out.println(code);
	}

}
