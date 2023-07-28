package collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsMethod {

	public static void main(String[] args) {
	
        ArrayList AL=new ArrayList();
        AL.add("G");
        AL.add("D");
        AL.add("V");
        AL.add("A");
        AL.add("T");
        AL.add("P");
       //Dublicate element add 
        System.out.println(AL);
        ArrayList AL1=new ArrayList();
        AL1.addAll(AL);
        System.out.println(AL1);
        
        //removeAll
        AL1.removeAll(AL);
        System.out.println(AL1);
        
        System.out.println(AL.isEmpty());
        System.out.println(AL1.isEmpty());
        
        //Inorder
        
        Collections.sort(AL);
        System.out.println(AL);
        Collections.sort(AL,Collections.reverseOrder());
        System.out.println(AL);
        
        
        





	}

}
