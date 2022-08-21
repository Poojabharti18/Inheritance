package inheritanceexample;

public class HybridD implements HybridA,HybridB,HybridC {

	public static void main(String[] args) {
		

	}

	@Override
	public void display2() {
	System.out.println("I");
		
	}

	@Override
	public void display1() {
		System.out.println("Love");
		
	}

	@Override
	public void display() {
		System.out.println("Moon");
		
	}
	

}
