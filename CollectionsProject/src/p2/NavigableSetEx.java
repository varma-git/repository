package p2;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class NavigableSetEx {
	static void showSet()
	{
		NavigableSet<String>nset=new TreeSet<>();
		nset.add("a");
		nset.add("b");
		nset.add("c");
		nset.add("d");
		//nset.add(null);
		NavigableSet<String>it=nset.descendingSet();
		System.out.println(it);
		System.out.println(nset);
		/*Iterator<String>it1=nset.descendingIterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
		System.out.println(nset);
		//System.out.println(it1.toString());*/
		SortedSet<String>s=nset.headSet("c", true);
		System.out.println(s);
		s=nset.tailSet("c");
		System.out.println(s);
		s=nset.subSet("a", false, "c", false);
		System.out.println(s);
	}
	public static void main(String args[])
	{
		showSet();
	}

}
