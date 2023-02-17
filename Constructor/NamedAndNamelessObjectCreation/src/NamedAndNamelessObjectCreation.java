
public class NamedAndNamelessObjectCreation {

	
	NamedAndNamelessObjectCreation(){
		System.out.println("0-arg cons");
	}
	NamedAndNamelessObjectCreation(int a){
		System.out.println("1-arg cons");
	}
	NamedAndNamelessObjectCreation(int a,int b){
		System.out.println("2-arg cons");
	}
	public static void main(String[] args) {
		//Named object creation
		System.out.println("Named object creation");
		NamedAndNamelessObjectCreation nn=new NamedAndNamelessObjectCreation();
		NamedAndNamelessObjectCreation nn1=new NamedAndNamelessObjectCreation(10);
		NamedAndNamelessObjectCreation nn2=new NamedAndNamelessObjectCreation(10,20);
		
		//Nameless object creation
		System.out.println("Name Less object creation");
		new NamedAndNamelessObjectCreation();
		new NamedAndNamelessObjectCreation(10);
		new NamedAndNamelessObjectCreation(10,20);

	}

}
