import java.util.*;
public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet<Integer> pt  = new TreeSet();
		pt.add(10);
		pt.add(20);
		pt.add(30);
		pt.add(40);
		pt.add(50);
		pt.add(20);
		System.out.println(pt);
		//System.out.println("Min value : "+pt.pollFirst());
		//System.out.println("Max value : "+pt.pollLast());
		System.out.println(pt.first());
		System.out.println(pt.last());
		System.out.println(pt.descendingSet());
		System.out.println(pt.floor(35));
		System.out.println(pt.ceiling(35));
		
		TreeSet pt2 = (TreeSet)pt.clone();
		System.out.println(pt2);
		
		System.out.println(pt.size());
		System.out.println(pt.headSet(30));
		System.out.println(pt.tailSet(30));
		System.out.println(pt.subSet(20, 50));
		
		
		

	}

}
