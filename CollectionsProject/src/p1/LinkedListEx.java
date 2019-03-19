package p1;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListEx {
	
	public void showLink()
	{
		LinkedList<String>list=new LinkedList<>();
		/*list.add("a");
		list.add("b");
		list.add("c");
		System.out.println("Intial size : "+list.size());
		list.addFirst("d");
		list.addLast("e");
		list.add(2, "f");
		System.out.println("New size : "+list.size());
		System.out.println(list);
		list.remove();
		System.out.println(list.toString());
		list.remove(2);
		System.out.println(list.toString());
		list.removeLast();
		System.out.println(list.toString());
		list.add("a");
		list.add("b");
		list.add("c");
		list.push("ii");
		System.out.println(list.toString());
		list.poll();
		System.out.println(list.toString());
		list.pollFirst();
		System.out.println(list.toString());
		list.remove();
		System.out.println(list.toString());
		ListIterator<String>list1=list.listIterator();
		System.out.println("In List Iterator forward direction");
		while(list1.hasNext())
		{
			System.out.println(list1.next());
		}
		System.out.println("In List Iterator backward direction");
		while(list1.hasPrevious())
		{
			System.out.println(list1.previous());
		}*/
		
		list.add("1");
		//list.push("7");
		list.add("2");
		list.push("3");
		list.push("4");
		list.add("5");
		list.add("6");
		list.pop();
		list.pop();
		list.pop();
		System.out.println(list);
	}
	public static void main(String args[])
	{
		LinkedListEx e=new LinkedListEx();
		e.showLink();
	}
}
