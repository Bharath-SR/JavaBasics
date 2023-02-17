
public class StringIndexOutOfBoundException {

	public static void main(String[] args) {
		
		String str="Bharath";
		System.out.println(str.charAt(0));
		
		//here String index out bound exception is thrown
		System.out.println(str.charAt(8));

	}

}
