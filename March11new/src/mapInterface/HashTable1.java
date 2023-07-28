package mapInterface;

import java.util.Hashtable;

public class HashTable1 {

	public static void main(String[] args) {
		Hashtable<Integer,String>HT = new Hashtable<Integer,String>();//default size is 17 and load factor-0.75

		HT.put(2,"John");
		HT.put(12, "Rohit");
		HT.put(25, "Rahul");
		HT.put(10, "David");
		//HT.put(null,null); //Hashtable doesn't allow null key and value throw null pointer exception
		HT.put(32, "sumit");
		HT.put(13,"sumit");
		System.out.println(HT);
		System.out.println(HT.remove(13));
		System.out.println(HT);
		
		System.out.println(HT.containsKey(13));
		System.out.println(HT.containsKey(25));
		System.out.println(HT.containsValue("sumit"));
		
		System.out.println(HT.isEmpty());
		System.out.println("******************");
		System.out.println(HT.keySet());
		System.out.println(HT.values());
		
		for(Object obj:HT.keySet()) {
			System.out.println(obj+"="+HT.get(obj));
		}
		
		
	}

}
