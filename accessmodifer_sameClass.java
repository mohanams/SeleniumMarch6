package day5;

public class accessmodifer_sameClass {

	private int a;
	
	private void privatemethod()
	{
		System.out.println("This is a private method");
	}
	
	
	int b;
	
	void defaultmethod()
	{
		System.out.println("This is a default method");
	}
	
	
	protected int c =10;
	
	protected void protectedmethod()
	{
		System.out.println("This is a protected method");
	}
	
	public int d;
	
	public void publicmethod()
	{
		System.out.println("This is a public method");
	}
	public static void main(String[] args) {
		
		accessmodifer_sameClass obj = new accessmodifer_sameClass();
		System.out.println(obj.a);
		obj.privatemethod();
		
		System.out.println(obj.b);
		obj.defaultmethod();
		
		System.out.println(obj.c);
		obj.protectedmethod();
		
		System.out.println(obj.d);
		obj.publicmethod();

	}

}
