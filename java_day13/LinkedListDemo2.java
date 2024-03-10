import java.util.*;
public class LinkedListDemo2 {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");
		list.add("Ravi");
		System.out.println(list);
		
		list.remove("Ravi");
		System.out.println(list);
		
		list.add("Ravi");
		list.add("Vijay");
		System.out.println(list);
		
		list.removeLastOccurrence("Vijay");
		System.out.println(list);
		
		System.out.println("element at second index : "+list.get(2));
		System.out.println("element at zero index : "+list.getFirst());
		System.out.println("element at last index : "+list.getLast());
		
		System.out.println(list.indexOf("Ravi"));
		System.out.println(list.indexOf("Vijay"));
		
		System.out.println(list.lastIndexOf("Ravi"));
		System.out.println(list.offer("pratham"));
		System.out.println(list.offerFirst("rajshri"));
		System.out.println(list);
		
		System.out.println(list.indexOf("Ravi"));
		
		
		list.pop();
		System.out.println(list);
		
		
		
		
	}

}
