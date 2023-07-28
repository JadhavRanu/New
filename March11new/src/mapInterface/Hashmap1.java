package mapInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmap1 {

	public static void main(String[] args) {
		HashMap<Integer , String>HM = new HashMap<Integer,String>();
		HashMap HM1 =new HashMap();
		HM.put(107, "John");//Pair/entry
		HM.put(102, "David");
		HM.put(104, "Rahul");
		HM.put(103, "Rohit");
		HM.put(101, "Rajan");
		HM.put(105, "Rahul");
		
		System.out.println(HM);
		System.out.println(HM.get(102));
		
		System.out.println(HM.containsKey(103));
		System.out.println(HM.containsKey(106));
		System.out.println(HM.containsValue("David"));
		
		System.out.println(HM.isEmpty());
		System.out.println(HM1.isEmpty());
		
		System.out.println(HM.keySet());
		System.out.println(HM.values());
		
		for(Object obj:HM.keySet()) {
			System.out.println(obj+"="+HM.get(obj));
		}
		
		
		//Iterator
		
		System.out.println("*****************");
		Set S = HM.entrySet();
		Iterator it = S.iterator();
		while(it.hasNext()) {
			Map.Entry entry =(Entry)it.next();
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
		
		
		//Entry method
		System.out.println("*****************");
		for(Map.Entry entry :HM.entrySet()) {
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
		
		
	}



}
