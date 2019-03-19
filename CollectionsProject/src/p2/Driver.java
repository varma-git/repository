package p2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class EmployeeEx
{
	String name,email;
	int deptno,exp;
	public EmployeeEx(String name, String email, int deptno, int exp) {
		super();
		this.name = name;
		this.email = email;
		this.deptno = deptno;
		this.exp = exp;
	}
	
}

class NameComparator implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return (o1.name.compareTo(o2.name));
	}
	
}

class ExpComparator implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1.exp>o2.exp)
			return 1;
		else if(o1.exp<o2.exp)
			return -1;
		else
			return 0;
	}
	
}

class EmailComparator implements Comparator<Employee>
{

	@Override
	public int compare(Employee emp1, Employee emp2) {
		// TODO Auto-generated method stub
		return ((emp1.email).compareTo(emp2.email));
	}
	
}

class DeptnoComparator implements Comparator<Employee>
{
	@Override
	public int compare(Employee emp1, Employee emp2) {
		// TODO Auto-generated method stub
		if(emp1.deptno>emp2.deptno)
			return 1;
		else if(emp1.deptno<emp2.deptno)
			return -1;
		else
			return 0;
	}	
}

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee>list=new ArrayList<Employee>();
		list.add(new Employee("abc","abc@gmail.com",321,5));
		list.add(new Employee("def","def@gmail.com",121,3));
		list.add(new Employee("ghi","hgi@gmail.com",231,15));
		list.add(new Employee("jkl","jkl@gmail.com",323,1));
		System.out.println("Sorting based on Name : ");
		Collections.sort(list, new NameComparator());
		for(Employee e1:list)
		{
			System.out.println(e1.name+" "+e1.email+" "+e1.deptno+" "+e1.exp);
		}
		System.out.println("Sorting based on Email : ");
		Collections.sort(list, new EmailComparator());
		for(Employee e1:list)
		{
			System.out.println(e1.name+" "+e1.email+" "+e1.deptno+" "+e1.exp);
		}
		System.out.println("Sorting based on DeptNo : ");
		Collections.sort(list, new DeptnoComparator());
		for(Employee e1:list)
		{
			System.out.println(e1.name+" "+e1.email+" "+e1.deptno+" "+e1.exp);
		}
		System.out.println("Sorting based on Exp : ");
		Collections.sort(list, new ExpComparator());
		for(Employee e1:list)
		{
			System.out.println(e1.name+" "+e1.email+" "+e1.deptno+" "+e1.exp);
		}
	}

}
