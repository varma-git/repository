package p3;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
	public void showQueue()
	{
		/*Queue<Integer> q1=new LinkedList<>();
		q1.add(234);
		q1.add(12);
		q1.add(100);
		q1.add(56);
		q1.add(23);
		System.out.println(q1);
		q1.remove();
		System.out.println(q1);
		System.out.println("poll : "+q1.poll());
		System.out.println(q1);
		System.out.println("Empty : "+q1.isEmpty());
		System.out.println("Contains 100? : "+q1.contains(100));
		System.out.println("Peek : "+q1.peek());
		System.out.println("Offer 345 : "+q1.offer(345));
		System.out.println(q1);
		System.out.println("Size : "+q1.size());
		LinkedList<Integer> list=(LinkedList<Integer>)q1;
		list.addFirst(10);
		System.out.println(q1);
		list.addLast(20);
		System.out.println(q1);*/
		
		Queue <String> q2=new PriorityQueue<>();
		q2.add("hari");
		q2.add("Hari");
		q2.add("Anil");
		q2.add("Teja");
		/*q2.add(234);
		q2.add(12);
		q2.add(100);
		q2.add(56);
		q2.add(23);
		q2.add(12);*/
		System.out.println(q2);
		System.out.println();
		Iterator<String>it=q2.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("Poll : "+q2.poll());
	}
	public static void main(String args[])
	{
		QueueDemo q=new QueueDemo();
		q.showQueue();
	}
}
