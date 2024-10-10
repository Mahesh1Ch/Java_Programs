import java.util.ArrayList;
import java.util.*;
class ArrayList1
{
	public static void main(String[] arg)
	{
		ArrayList<Integer> al = new ArrayList<Integer>();

		al.add(10);
		al.add(40);
		al.add(30);
		al.add(20);
		al.add(50);
		al.add(80);
		al.add(70);
		al.add(60);
		al.add(90);

		ListIterator<Integer> itr = al.listIterator();

		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

		System.out.println();

		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}

	}
}