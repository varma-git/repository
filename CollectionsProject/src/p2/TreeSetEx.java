package p2;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx {

	static void showSet()
	{
		TreeSet<String>tset=new TreeSet<>();
		tset.add("A");
		tset.add("a");
		tset.add("A");
		tset.add("1");
		//tset.add(null);
		System.out.println(tset);
		Iterator<String>it=tset.descendingIterator();
		while(it.hasNext())
		{
			System.out.print(it.next());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showSet();
	}

}
