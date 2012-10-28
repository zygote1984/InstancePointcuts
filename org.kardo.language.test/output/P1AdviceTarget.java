import java.util.*;
public class P1AdviceTarget{
	
	private static WeakHashMap<Integer, Integer> p1_data = new WeakHashMap<Integer, Integer>();
	
	public static Set<Integer> p1()
	{
		return Collections.unmodifiableSet(p1_data.keySet());
	}
	
	public static void p1_addInstance(Integer instance)
	{
		if(p1_data.containsKey(instance))
		{
			Integer value = p1_data.get(instance);
			value++;
			p1_data.put(instance,value);
		}
		else
			p1_data.put(instance, new Integer(1));
	
		p1_instanceAdded(instance);
	}
	
	public static void p1_removeInstance(Integer instance)
	{
		if(p1_data.containsKey(instance))
		{
			Integer value = p1_data.get(instance);
			value--;
			if(value == 0)
				p1_data.remove(instance);
			else	
				p1_data.put(instance,value);
		}
		
		p1_instanceRemoved(instance);	
	}	
	
	public static int p1_cardinality(Integer instance)
	{
		return p1_data.get(instance);
	}	
	
	private static void p1_setCardinality(Integer instance, int c)
	{
		p1_data.put(instance, new Integer(c));
	}	
	
	public static void p1_instanceAdded(Integer instance){}
	public static void p1_instanceRemoved(Integer instance){}
	
}	
