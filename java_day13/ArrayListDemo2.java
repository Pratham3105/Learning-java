import java.util.*;
public class ArrayListDemo2 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Mango");
		list.add("Apple");
		list.add("Grapes");
		list.add("Banana");
		
		System.out.println(list);
		/*
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		for(String fruit:list)
		{
			System.out.println(fruit);
		}
		*/
		System.out.println("Element at specific index : "+list.get(3));
		System.out.println("Size of arraylist : "+list.size());
		list.set(2, "pratham"); // element change , previous one will be removed 
		System.out.println(list);
		list.add(1,"rajshri");
		System.out.println(list);
		ArrayList t = new ArrayList();
		list.clone();
		System.out.println(list);
		System.out.println(t);
		
	}

}
