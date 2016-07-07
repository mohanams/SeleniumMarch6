package assignment;

public class SwapDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Swapnumbers obj = new Swapnumbers();
		System.out.println(obj.x+"  "+obj.y);
		/*obj.swap(obj.x, obj.y);
		System.out.println(obj.x+"  "+obj.y);*/
		obj.swap(obj);
		System.out.println(obj.x+"  "+obj.y);

	}

}
