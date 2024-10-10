import java.util.Comparator;
import java.util.Arrays;

class Emp
{
	int id;
	String name;
	Double salary;

	public Emp(int id,String name,Double salary)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString()
	{
		return "Employee[ Id :"+this.id+",Name :"+this.name+",Salary:"+this.salary +"]";
	}

}

class SortById implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		Emp e1  = (Emp)o1;
		Emp e2 = (Emp)o2;

		return Double.compare(e1.id,e2.id);
	}
}

class ComparatorP1
{
	public static void main(String[] args)
	{
		Emp[] emp = new Emp[5];
		emp[0] = new Emp(1001,"AAA",1005d);
		emp[1] = new Emp(1005,"DDD",1007d);
		emp[2] = new Emp(1006,"BBB",1006d);
		emp[3] = new Emp(1008,"CCC",1005d);
		emp[4] = new Emp(1009,"EEE",1009d);

		Arrays.sort(emp,new SortById());

		Comparator sort_by_double = (o1,o2)->
		{
			Emp e1 = (Emp)o1;
			Emp e2 = (Emp)o2;

			return Double.compare(e1.salary,e2.salary);
		};

		Arrays.sort(emp,sort_by_double);

		for(Emp e : emp)
		{
			System.out.println(e);
		}
	}
}