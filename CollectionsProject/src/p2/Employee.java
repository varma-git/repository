package p2;

import java.util.ArrayList;
import java.util.Collections;

public class Employee implements Comparable<Employee>
{
	String name,email;
	int deptno,exp;
	
	public Employee(String name, String email, int deptno, int exp) {
		super();
		this.name = name;
		this.email = email;
		this.deptno = deptno;
		this.exp = exp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> list=new ArrayList<>();
		list.add(new Employee("abc","abc@gmail.com",321,5));
		list.add(new Employee("def","def@gmail.com",121,3));
		list.add(new Employee("ghi","hgi@gmail.com",231,15));
		list.add(new Employee("jkl","jkl@gmail.com",323,1));
		Collections.sort(list);
		for(Employee e1: list)
		{
			System.out.println(e1.name+" "+e1.email+" "+e1.deptno+" "+e1.exp);
		}
		System.out.println(list);
	}
	@Override
	public int compareTo(Employee emp) {
		// TODO Auto-generated method stub
		/*if(exp==emp.exp)
			return 0;
		else if(exp>emp.exp)
			return 1;
		else
			return -1;*/
		return (name.compareToIgnoreCase(emp.name));
	}
}
