package day6;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<String> arr = new HashSet<String>();
		//HashSet<String> arr = new HashSet<String>();
				
				arr.add("orange");
				arr.add("apple");
				arr.add("grape");
				arr.add("pinapple");
				arr.add(null);
				arr.add("orange");
				arr.add(null);
				
				System.out.println(arr);
				
				arr.add("mango");
				//arr.add(2, "jackfruit");
				System.out.println(arr);
				
				/*for(String i: arr)
				{
					System.out.println(i);
				}*/
				
				Iterator<String> itr = arr.iterator();
				
				while(itr.hasNext())
				{
					System.out.println(itr.next());
				}
				


	}

}
