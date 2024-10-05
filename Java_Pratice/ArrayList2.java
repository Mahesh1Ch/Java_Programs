import java.util.ArrayList;
class ArrayList2
{
	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();
		al.add(10);
		al.add("java");
		al.add('C');
		al.add("C");
		al.add(30);

		System.out.println(al);
		al.remove(Integer.valueOf(30));
		System.out.println(al);

		System.out.println(al.contains('C'));
		System.out.println(al.contains("C"));

		
	}
}