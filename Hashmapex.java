package day6;

import java.util.HashMap;

public class Hashmapex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(101, "Jim");
		map.put(102, "fasal");
		map.put(103, null);
		map.put(104, "anju");
		map.put(105, "RK");
		map.put(105, "Saravanan");
		map.put(null, "xxx");
		map.put(null, "yyyy");
		map.put(106, "swati");
		map.put(107, "swati");
		
		System.out.println(map);
		
		System.out.println(map.get(107));
		
		System.out.println("*******************************");
		
		for(Integer i : map.keySet())
		{
			
				System.out.println(map.get(i));
			
		}

	}

}
