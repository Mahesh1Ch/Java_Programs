class Emp
{
	private int id;
	private String name;
	private long phone;

	public Emp(int id,String name,long phone)
	{
		this.id=id;
		this.name=name;
		this.phone=phone;
	}


	@Override
	public int hashCode()
	{
		int result = Integer.hashCode(id);
		result = 31*result+ (name != null ? name.hashCode() : 0);
		result = 31*result+Long.hashCode(phone);

		return result;
	}



	@Override
	public boolean equals(Object obj)
	{
		Emp e1 = (Emp)obj;
		return this.id==e1.id && this.name.equals(e1.name) && this.phone == e1.phone;
	}

	@Override
	public String toString()
	{
		return "Employee["+"Id:"+this.id+",Name:"+this.name+",Phone:"+this.phone+"]";
	}
}

public class EmpMain
{
	public static void main(String args[])
	{

		Emp emp1 = new Emp(1000,"AAA",9999999999l);
		Emp emp2 = new Emp(1000,"AAA",9999999999l);
		System.out.println(emp1);
		System.out.println(emp1);
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		System.out.println(emp1.equals(emp2));
	}
}