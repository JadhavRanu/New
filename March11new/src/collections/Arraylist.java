package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {
	


	

		public static void main(String[] args) {
			int Arr[]= new int[5];//static +smililar type of data
			ArrayList AL = new ArrayList();//dynamic array homo+hetero
			//1.Add - to add the element in arraylist
			AL.add("priya");
			AL.add(34);
			AL.add('A');
			AL.add(true);
			AL.add(20.20);
			System.out.println(AL);
			
	//dublicate
			ArrayList duplicate = new ArrayList();
			duplicate.addAll(AL);
			System.out.println(duplicate);
			System.out.println("%%%%%%%%");
			
			System.out.println(AL.size());
			System.out.println(AL.get(4));
			
			//Remove all
			
			duplicate.removeAll(AL);
			System.out.println(duplicate);
			//get
			System.out.println(AL.get(4));
			
			//Set
			AL.set(3, "Java");
			System.out.println(AL);
			//get
			//for loop
			for(int i=0;i<AL.size();i++) {
				System.out.println(AL.get(i));
			}
			System.out.println("***************");
			//For each 
			
			for(Object obj:AL) {
				
				System.out.println(obj);
			}
			
			//iterator
			Iterator it =AL.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
				
				
			}
			
			//contains
			System.out.println(AL.contains("java"));
			System.out.println(AL.contains("Java"));
			
			
			
			
			
			
			
			
		}

	}



