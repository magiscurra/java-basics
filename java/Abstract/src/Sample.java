
public class Sample extends Hello{
	
	void onText(String text) {
		
		System.out.println(text);
	}
	
	Sample(){
		TextScanner t=new TextScanner(this);
		t.scan();
		
	}
	
	public static void main(String[] args) {
		Sample s=new Sample();
		
	}

}
