package p1;
import java.util.Enumeration;
import java.util.Vector;
public class VectorEx {
	public void showVector()
	{
		//Vector<String>list=new Vector<>();
		//Vector<String>list=new Vector<>(5);
		Vector<String>list=new Vector<>(5,1);
		System.out.println("Size : "+list.size());
		System.out.println("Size : "+list.capacity());
		list.addElement("a");
		list.addElement("b");
		list.addElement("c");
		list.addElement("a");
		list.addElement("b");
		list.addElement("c");
		list.addElement("a");
		list.addElement("b");
		list.addElement("c");
		list.addElement("a");
		list.addElement("b");
		list.addElement("c");
		System.out.println("Size : "+list.size());
		System.out.println("Size : "+list.capacity());
		Enumeration<String>it=list.elements();
		while(it.hasMoreElements())
		{
			System.out.print(it.nextElement());
		}
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		VectorEx e=new VectorEx();
		e.showVector();
	}
}
