package p2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {

	public void showSet()
	{
		Set<String>hset=new HashSet<>();
		hset.add("ABC");
		hset.add(null);
		hset.add("abc");
		hset.add("123");
		hset.add("abc");
		hset.add(null);
		
		System.out.println(hset);
		
		Iterator<String> it=hset.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSetEx e=new HashSetEx();
		e.showSet();
	}

}
