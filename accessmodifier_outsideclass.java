package day5;

public class accessmodifier_outsideclass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		accessmodifer_sameClass obj = new accessmodifer_sameClass();
		//private stuff cannot be accessed outside class in the same package
		System.out.println(obj.b);
		obj.defaultmethod();
		
		System.out.println(obj.c);
		obj.protectedmethod();
		
		System.out.println(obj.d);
		obj.publicmethod();
	}

}
