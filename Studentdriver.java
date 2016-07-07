package day4;

public class Studentdriver {

	
	public static void main(String[] args) {
		
		Student anju = new Student();
		anju.studentname = " Anju";
		anju.math= 10;
		anju.science= 20;
		anju.social = 30;
		
		//anju.school = "no school";
		//anju.add(anju.math, anju.science, anju.social);
		anju.add();
		System.out.println(Student.school);
		//System.out.println(anju.school);
		
		Student fasal = new Student();
		fasal.studentname = " fasal";
		fasal.math= 20;
		fasal.science= 40;
		fasal.social = 30;
		//fasal.school = "St.joseph";
		//fasal.add(fasal.math, fasal.science, fasal.social);
		fasal.add();
		System.out.println(Student.school);
		//System.out.println(fasal.school);

	}

}
