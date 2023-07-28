package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
	LinkedList LL = new LinkedList();//heteroge
	LinkedList<String> LL1 = new LinkedList<String>();//homo
		
		LL.add("AA");
		LL.add('P');
		LL.add(300);
		LL.add(true);
		LL.add(null);
		LL.add(29.8);
		
		System.out.println(LL);
		//get
		System.out.println(LL.get(4));
		System.out.println(LL.size());
		System.out.println(LL.remove("AA"));
		System.out.println(LL);
		LL.add(2,"Java");
		System.out.println(LL);
		
		//getFirstelement
		System.out.println(LL.getFirst());
		
		//get last element
		System.out.println(LL.getLast());
		
		//contains
		System.out.println(LL.contains(null));
		System.out.println(LL.contains(200));
		System.out.println("**********");
		//isempty
		System.out.println(LL.isEmpty());
		System.out.println(LL1.isEmpty());
		
		
	//for loop
		System.out.println("ForLoop");
		for(int i=0;i<LL.size();i++) {
			System.out.println(LL.get(i));
		
		}
		//Foreach
		
		System.out.println("For each Loop");
		
		for(Object obj:LL) {
			System.out.println(obj);
		}
		
       //iterator
		System.out.println("By using Iteretor");
		Iterator it =LL.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		
		
	}

}
