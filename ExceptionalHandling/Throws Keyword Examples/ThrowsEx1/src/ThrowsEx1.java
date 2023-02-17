
public class ThrowsEx1 {

	
	void cm() throws InterruptedException {
		System.out.println("Sleeping");
		Thread.sleep(2000);
		System.out.println("Sleeping");
	}
	void mp()throws InterruptedException {
		cm();
	}
	void mla() throws InterruptedException {
		mp();
	}
	public static void main(String[] args) throws InterruptedException {
		
			new ThrowsEx1().mla();
	}

}
