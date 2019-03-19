package p1;

import java.util.*;

public class ListEx {
	String s1[];
	public void method()
	{
		String s[];
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Size of String Array : ");
		int len=sc.nextInt();
		s=new String[len];
		System.out.println("Enter "+len+" values to String Array : ");
		for(int i=0;i<len;i++)
		{
			s[i]=sc.next();
		}
		System.out.print("Array : ");
		for(int i=0;i<len;i++)
		{
			System.out.print(s[i]+"\t");
		}
		System.out.println("\n");
		List<String> li=new ArrayList<>();
		li=Arrays.asList(s);
		Iterator<String> it=li.iterator();
		System.out.print("Array to List : ");
		while(it.hasNext())
		{
			System.out.print(it.next()+"\t");
		}
		System.out.println("\n");
		//String 
		s1=new String[len];
		li.toArray(s1);
		Iterator<String> itr=li.iterator();
		System.out.print("List to Array : ");
		while(itr.hasNext())
		{
			System.out.print(itr.next()+"\t");
		}
	}

	public static void main(String[] args) {
		ListEx e=new ListEx();
		e.method();
	}

}
