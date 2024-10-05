import java.util.HashMap;
import java.util.*;
class MapParctice
{
	public static void main(String[] args)
	{

		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1000,"AAA");
		hm.put(1002,"BBB");
		hm.put(1005,"CCC");
		hm.put(1007,"DDD");
		hm.put(1008,"EEE");
		hm.put(1009,"FFF");

		Iterator<Map.Entry<Integer,String>> itr = hm.entrySet().iterator();

		while(itr.hasNext())
		{
			Map.Entry<Integer,String> map = itr.next();
			System.out.println(map.getKey()+" "+map.getValue());
		}

	}
}