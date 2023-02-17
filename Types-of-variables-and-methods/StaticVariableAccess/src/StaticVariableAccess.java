
public class StaticVariableAccess {

	static int z=90;
	public static void main(String[] args) {
		//there are three ways to access static variable
		
		System.out.println(StaticVariableAccess.z);//1-way using classname
		System.out.println(z);//2-way direct access if within pacakge
		StaticVariableAccess sa=new StaticVariableAccess();
		System.out.println(sa.z);//3-way using object
	
	}

}
