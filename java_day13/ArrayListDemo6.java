import java.util.*;
public class ArrayListDemo6 {

	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		list1.add("Mango");
		list1.add("Apple");
		list1.add("Grapes");
		list1.add("Banana");
		list1.add("apple");
		list1.add("grapes");
		list1.add("raj");
			
		list2.add("pratham");
		list2.add("prashant");
		list2.add("raj");
		list2.add("Amit");
		list2.add("rohan");
		list2.add("ankit");
		list2.add("Mango");
		list2.add("Apple");	
		
		list1.retainAll(list2);
		System.out.println(list1);
		
		if(list1.contains("Mango"))
		{
			System.out.println("Element is present");
		}
		else 
		{
			System.out.println("Element is not present");
		}
		list1.
	}

}
