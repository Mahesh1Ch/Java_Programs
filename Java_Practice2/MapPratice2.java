import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
class MapPratice2
{
	public static void main(String[] args)
	{
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1001,"AAA");
		hm.put(1002,"BBB");
		hm.put(1003,"CCC");
		hm.replace(1002,"EEE");
		hm.remove(1003);

		Iterator<Map.Entry<Integer,String>> itr = hm.entrySet().iterator();

		while(itr.hasNext())
		{
			Map.Entry<Integer,String> e = itr.next();
			System.out.println(e.getKey()+" "+e.getValue());
		}

		//hm.forEach(e->System.out.println(e));


	}	
}