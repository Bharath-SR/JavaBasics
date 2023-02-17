
public class ThrowsEx2 {
	
	
	void cm() throws InterruptedException{
		System.out.println("sleeping");
		Thread.sleep(2000);		
		System.out.println("sleeping");
	}
	void mp() throws InterruptedException {
		cm();
	}
	void mla() {
		try {
		mp();}
		catch(InterruptedException i) {
			i.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new ThrowsEx2().mla();

	}

}
