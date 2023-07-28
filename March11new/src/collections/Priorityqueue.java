package collections;

import java.util.PriorityQueue;

public class Priorityqueue {

	public static void main(String[] args) {
		
		PriorityQueue PQ =new PriorityQueue();
		PriorityQueue PQ1 =new PriorityQueue();
		
		PQ.add('G');
		PQ.add('A');
		PQ.add('B');
		PQ.add('C');
		PQ.add('P');
		PQ.offer('T');
		System.out.println(PQ);
		//1.PQ.offer("HH")
		//System.out.println(PQ.offer());
		//PQ.offer(null);//null pointerexception
		System.out.println(PQ.offer('r'));
		System.out.println(PQ);
		
		// 3.Element
		System.out.println(PQ.element());
		//System.out.println(PQ1.element()); No such ElementException
		
		//4.peak
		System.out.println(PQ.peek());
		System.out.println(PQ1.peek());//null
		
		//Remove and poll
		
		System.out.println(PQ.remove());
		//System.out.println(PQ1.remove()); // NosuchelementException
		System.out.println(PQ);
		System.out.println(PQ.poll());
		System.out.println(PQ);
		
		for(Object obj:PQ) {
			System.out.println(obj);
		}
	}

}
