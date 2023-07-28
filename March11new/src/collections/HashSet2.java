package collections;

import java.util.HashSet;

public class HashSet2 {

	public static void main(String[] args) {
		
        HashSet HS2 = new HashSet();// DC= 16 and load factor -0.75 and hetero
		
        HS2.add(12);
        HS2.add(24);
        HS2.add(36);
        HS2.add(48);
        HS2.add(60);
        
       	HashSet HS3 = new HashSet();
		
       	HS3.add(60);
        HS3.add(24);
        HS3.add(36);
        HS3.add(48);
        HS3.add(65);
        
        //HS2.addAll(HS3); only display unique element
        HS2.addAll(HS3);
        System.out.println(HS2);
    
        
        //retainall only common element will displayed
        HS2.retainAll(HS3);
        System.out.println(HS2);
       // removeAll
       HS2.removeAll(HS3);
       System.out.println(HS2);
	}

}
