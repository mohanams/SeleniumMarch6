package day5;

public class InheritanceDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PageA a = new PageA();
		a.add();
		System.out.println("Result from page A "+a.result);
		
		
		PageB b = new PageB();
		b.add();
		System.out.println("Result from Page B "+ b.result);
		
		b.add2sub10();
		System.out.println("Result from Page B "+ b.result);
		
		System.out.println();
		System.out.println();
		
		PageC c = new PageC();
		c.add();
		System.out.println("Result from Page c "+ c.result);
		c.add2sub10();
		System.out.println("Result from Page c "+ c.result);
		c.add2sub10div();
		System.out.println("Result from Page c "+ c.result);
	}

}
