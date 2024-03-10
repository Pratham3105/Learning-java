import java.util.ArrayList;

public class ArrayListDemo5 {

	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		list1.add("Mango");
		list1.add("Apple");
		list1.add("Grapes");
		list1.add("Banana");
		list1.add("apple");
		list1.add("grapes");
		System.out.println(list1);
		
		list2.add("pratham");
		list2.add("prashant");
		list2.add("raj");
		list2.add("Amit");
		list2.add("rohan");
		list2.add("ankit");
		System.out.println(list2);
		
		list1.addAll(list2);
		System.out.println(list1);
		System.out.println(list2);
		
		list1.removeAll(list2);
		System.out.println(list1);
		
		//list1.clear();
		//System.out.println(list1);
		
		
		
		

	}

}
