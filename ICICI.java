package day5;

public class ICICI implements RBI{

	@Override
	public void withdraw() {
		System.out.println(" The customer 5 reward points ICICI");
		
	}

	@Override
	public void deposit() {
		System.out.println("8 percent annual interest ICICI");
		
	}

	@Override
	public void loan() {
		System.out.println("Minimum 4 percent ICICI ");
		
	}
	
	
	public void Happybonanza()
	{
		System.out.println("Get 100 reward points on each transaction at wine shop ICICI");
	}

}
