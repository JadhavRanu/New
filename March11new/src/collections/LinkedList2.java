package collections;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList2 {

	public static void main(String[] args) {
		 LinkedList LL=new LinkedList();
	        LL.add("P");
	        LL.add("D");
	        LL.add("s");
	        LL.add("B");
	        LL.add("l");
	        LL.add("q");
	       System.out.println(LL);
	        LinkedList LL1=new LinkedList(); 
	        LL1.addAll(LL);
	        System.out.println(LL1);
	        
	       //removeall
	        System.out.println(LL1.removeAll(LL1));
	        System.out.println(LL1);
	        
	        //Collections
	       Collections.sort(LL);
	       System.out.println(LL);
	       //Reverse order
	       Collections.sort(LL,Collections.reverseOrder());
	       System.out.println(LL);
	        
	        

	}

}
