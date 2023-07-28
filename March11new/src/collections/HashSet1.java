package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {

	public static void main(String[] args) {
		HashSet HS = new HashSet();// DC= 16 and load factor -0.75 and hetero
		
		HashSet HS1 = new HashSet(20,30.5f);
		HashSet <String>HS2 = new HashSet<String>();// homo
		
		HS.add("WE");
		HS.add('P');
		HS.add(20);
		HS.add(40.5);
		HS.add(true);
		HS.add(null);
		HS.add(null);
		
		System.out.println(HS);
		System.out.println(HS.size());// only one null value accept
		System.out.println(HS.add('h'));
		HS.add('h');
		System.out.println(HS);
		
		System.out.println(HS.add('P'));
		//if u r trying to add duplicate element then it will return false.
		//if the element is not present in hashset that time it will return true
		// set and get are not present hashset.
		
		//remove
		HS.remove("WE");
		System.out.println(HS);
		
		//isEmpty
		System.out.println(HS.isEmpty());
		System.out.println(HS1.isEmpty());
		System.out.println("**************");
		//contains
		
		System.out.println(HS.contains("WE"));
		System.out.println(HS.contains(20));
		
		// for loop not applicable
		/*for(int i=0;i<HS.size();i++) {}
		System.out.println(HS.get(i));*/	
		
		// for each loop
		
		for(Object obj:HS) {
			
			System.out.println(obj);
		}
		System.out.println("**************");
		// iterator
		Iterator it = HS.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		
		
		
		
		
	}

}
