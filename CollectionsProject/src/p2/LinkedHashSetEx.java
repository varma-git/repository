package p2;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetEx {
	static void showSet()
	{
		Set<String> lhset=new LinkedHashSet<>();
		lhset.add("AB");
		lhset.add("ab");
		lhset.add("AB");
		lhset.add("12");
		System.out.println(lhset);
		Iterator<String> it=lhset.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showSet();
	}

}
