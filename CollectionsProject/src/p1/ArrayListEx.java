package p1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx {
	public void showList()
	{
		ArrayList<Integer> list=new ArrayList<>();
		//list.add("abc");
		list.add(100);
		list.add(1, 200);
		list.add(1, 300);
		list.add(2, 400);
		//System.out.println(list); //for printing entire list
		//for each loop for printing list-not recommended, use
		for(Object o:list)
		{
			System.out.println(o);
		}
		//Iterator for printing
		Iterator<Integer> it=list.iterator();
		while(it.hasNext()) // just checks if data is present at next index or not
		{
			System.out.println(it.next()); //next() picksup the data and increments
		}
		System.out.println("Size : "+list.size());
		System.out.println(list.remove(1)); //prints which element is removed from that index position
		//list.remove(1);
		System.out.println(list);
		int i=200;
		if(list.contains(i))
		{
			System.out.println("List contains "+i);
		}else
			System.out.println("List doesn't contain "+i);
		
		if(list.isEmpty())
		{
			System.out.println("List is Empty");
		}else
			System.out.println("List is not empty");
		
		System.out.println("Value at index 1 is "+list.get(1));
		
		int b[];
		//ArrayList<Integer> list1=new ArrayList<>();
		Object list1[]=list.toArray();
		for(int j=0;j<list1.length;j++)
		{
			System.out.println(list1);
		}
		
		list.clear();
		System.out.println(list);
	}
	public static void main(String[] args) {
		ArrayListEx e=new ArrayListEx();
		e.showList();	
	}

}
