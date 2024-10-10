import java.util.HashMap;
import java.util.*;
class MapPratice1
{
	public static void main(String[] args)
	{
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(1001,"AAA");
		map.put(1004,"BBB");
		map.put(1002,"CCC");
		map.put(1003,"DDD");
		map.put(1004,"EEE");
		map.put(1005,"FFF");

		System.out.println(map.get(1004));
		
		System.out.println(map.replace(1005,"fff"));

		System.out.println(map.remove(1004));

		System.out.println(map.containsKey(1004));



		Iterator<Map.Entry<Integer,String>> itr = map.entrySet().iterator();

		while(itr.hasNext())
		{
			Map.Entry<Integer,String> m = itr.next();
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}
}