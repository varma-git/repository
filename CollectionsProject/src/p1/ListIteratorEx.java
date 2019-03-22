package p1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorEx {
	public void showList()
	{
		List<String>list=new ArrayList<>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("ddd");
		list.add("123");
		Iterator<String>it=list.iterator();
		System.out.println("In Iterator forward direction");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
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
		}
	}

	public static void main(String[] args)
	{
		ListIteratorEx e=new ListIteratorEx();
		e.showList();
	}

}
