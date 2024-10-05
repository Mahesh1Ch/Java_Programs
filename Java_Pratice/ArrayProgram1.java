import java.util.ArrayList;
import java.util.*;

class Employee
{
	int id;
	String name;
	double salary;
	public Employee(int id,String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}


}

class SortBySalary implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		Employee e1 = (Employee)o1;
		Employee e2 = (Employee)o2;

		return Double.compare(e1.salary,e2.salary);

	}
}

class ArrayProgram1
{
	public static void main(String[] args)
	{
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(1000,"AAA",1001));
		al.add(new Employee(1003,"BBB",1005));
		al.add(new Employee(1002,"DDD",1009));
		al.add(new Employee(1001,"CCC",1007));
		al.add(new Employee(1006,"EEE",1008));
		al.add(new Employee(1007,"FFF",1020));
		al.add(new Employee(1009,"GGG",1021));
		al.add(new Employee(1010,"HHH",1025));
		al.add(new Employee(1011,"III",1030));
		al.add(new Employee(1016,"JJJ",1050));


		Collections.sort(al,new SortBySalary());


		Iterator<Employee> itr = al.iterator();


		while(itr.hasNext())
		{
			Employee e =(Employee)itr.next();
			System.out.println("ID :"+e.id+",Name: "+e.name+",Salary  :"+e.salary);
		}

	}
}