package collections;

import java.util.Iterator;
import java.util.Vector;

public class VectorClass {

	public static void main(String[] args) {
		Vector VC =new Vector();//hetero
		
		VC.add("welcome");
		VC.add('B');
		VC.add(true);
		VC.add(20);
		VC.add(null);
		
		System.out.println(VC);
		System.out.println(VC.size());
		VC.add(30.5);
		//remove
		VC.remove(4);
		System.out.println(VC);
		System.out.println("*************");
		// update
		VC.set(1, 'R');
		VC.set(2, false);
		System.out.println(VC);
		VC.add(4, 50);
		System.out.println(VC);
		
		
	//for loop
		System.out.println("For loop");
		
		for(int i=0;i<VC.size();i++) {
			System.out.println(VC.get(i));		
		}
		System.out.println("**********");
		//foreach loop
		
		for(Object obj:VC) {
			System.out.println(obj);		
		}
		System.out.println("************");
		//iterator
		Iterator it= VC.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		
		
		
		

	}

}
