
public class ArrayIndexOutOfBound {
	
	

	public static void main(String[] args) {
		int array[]= {3,5,7,8,9,90};
		System.out.println(array[3]);
		System.out.println(array[10]);//Array index out of bound exception will be thrown since array doesnt have 10 elements
		//and this below code wont be executed after exception
		System.out.println(array[4]);
	}

}
