
public class B extends A {
	
	int a;
	
	void displa() {
		
		System.out.println("It's B");
		
		
		
	}
	void baseDisplay() {
		super.display();
		
	}
	
	
	public static void main(String[] args) {
		
		B b=new B();
		b.baseDisplay();
	}

}
