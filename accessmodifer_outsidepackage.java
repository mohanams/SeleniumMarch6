package accessmodifer_outsidepac;

import day5.accessmodifer_sameClass;

public class accessmodifer_outsidepackage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		accessmodifer_sameClass obj = new accessmodifer_sameClass();
		//private stuff cannot be accessed outside class outside package
		//default stuff cannot be accessed outside package
		//protected stuff cannot be accessed outside package
		System.out.println(obj.d);
		obj.publicmethod();
	
	}

}
