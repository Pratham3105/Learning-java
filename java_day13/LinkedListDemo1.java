import java.util.*;
public class LinkedListDemo1 {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");
		list.add("Ravi");
		System.out.println(list);
		
		/*
		for(String str:list)
		{
			System.out.println(str);
		}
		*/
		
		list.addFirst("Amit");
		System.out.println("After adding in the first position");
		System.out.println(list);
		
		list.addLast("Raj");
		System.out.println("After adding in the last position");
		System.out.println(list);
		
		list.removeFirst();
		System.out.println("After removing in the first position");
		System.out.println(list);
		
		list.removeLast();
		System.out.println("After removing in the last position");
		System.out.println(list);
		
		list.remove();
		System.out.println(list);
		
		list.remove(1);
		System.out.println(list);
		
		list.add("pratham");
		list.add("raj");
		list.add("prashant");
		System.out.println(list);
		
		
		


	}

}
