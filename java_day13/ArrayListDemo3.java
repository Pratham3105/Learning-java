import java.util.*;
public class ArrayListDemo3 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Mango");
		list.add("Apple");
		list.add("Grapes");
		list.add("Banana");
		list.add("apple");
		list.add("grapes");
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		// lacxico graphical manner
		
		System.out.println(list.size());
		Collections.swap(list, 0, 1);
		System.out.println(list);
		
		System.out.println("after removing the index 3 : "+list.remove(3));
		System.out.println(list);
		System.out.println(list.remove("apple"));
		System.out.println(list);
		
		
		
		
		
	}

}
