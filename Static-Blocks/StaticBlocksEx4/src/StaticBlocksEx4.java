
public class StaticBlocksEx4 {
	
	//static variables
	
	static int id;
	
	//static method
	static void dispaly() {
		System.out.println(id);
	}
	
	//static block
	static {
		id=5;
	}

	public static void main(String[] args) {
		StaticBlocksEx4.dispaly();

	}

}
