package day4;



public class Student {
	
	String studentname;
	int math ;
	int science ;
	int social;
	static String school  = "St.joseph";
	
	public Student()
	{
		System.out.println("This is my default constructor");
	}
	
	public Student(String name , int x, int y, int z)
	{
		studentname = name;
		math = x;
		science = y;
		social = z;
	}
	
	public void add(int math, int science, int social)
	{
	 int Total=	math + science+social;
	 System.out.println(" The total is "+ Total);
	}
	
	public void add()
	{
		 int Total=	math + science+social;
		 String name = getname(); // nonstatic method can directly access nonstatic methods of the same class
		 System.out.println(" The total for the student "+name + " is "+ Total );
	}
	
	public int add(int c)
	{
		int x = 10;
		System.out.println(school);//static variable can be directly access inside a non static method
		location();//static method can be directly access inside a non static method
		return x;
	}
	
	public String getname()
	{
		return studentname;// nonstatic method can directly access non staqtic variables of the same class
	}
	
	public static void location()
	{
		
		
		System.out.println("The location is Bangalore");
		System.out.println(school);
		
		Student ref = new Student();
		
		System.out.println(ref.studentname);//non static variable cannot be directly accessed in a static method of the same class
		ref.getname();//non static method cannot be directly accessed in a static method of the same class
	}
	
	
	
	
	
	
	
	
	

}
