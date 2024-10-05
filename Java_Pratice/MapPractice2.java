import java.util.HashMap;
import java.util.*;
class MapPractice2
{
	public static void main(String[] args)
	{
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1000,"AAA");
		hm.put(1002,"BBB");

		hm.put(1005,"CCC");
		hm.put(1003,"DDD");
		hm.put(1004,"EEE");
		hm.put(1006,"FFF");


		Iterator<Map.Entry<Integer,String>> itr = hm.entrySet().iterator();

		while(itr.hasNext())
		{
			Map.Entry<Integer,String> map=itr.next();
			System.out.println(map.getKey()+" "+map.getValue());
		}


	}
}