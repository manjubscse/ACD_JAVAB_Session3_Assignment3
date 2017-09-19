//CLASS CONSTRUCTOR CHAINING CHILD EXTENDS THE OTHER CLASS
public class ConstructorChainingChild extends ConstructorChaining {

	// CONSTRUCTOR WITH NO PARATMETER
	public ConstructorChainingChild() {
		this("A"); // CONSTRUCTOR WITH ONE PARATMETER
		System.out.println("Called one paramenter child constructor");
	}
	// CONSTRUCTOR WITH ONE PARATMETER
	public ConstructorChainingChild(String X) {
		this("A","B"); // CALLED CONSTRUCTOR WITH TWO PARATMETER
		System.out.println("Called two paramenter child constructor");
	}
	// CONSTRUCTOR WITH TWO PARATMETER
	public ConstructorChainingChild(String X,String Y) {
		super(2,5,8); // CALLS THE CONSTRUCTOR OF PARENT CLASS WITH WITH THREE PARATMETER
		System.out.println("Called three paramenter Master class constructor");
	}
	
	// METHOD TO DISPLAY MESSAGE
	public void Display() 
	{ 
		System.out.println("This is Constructor chaining with Same class and Child and Parent Class");
	}
	// MAIN METHOD FOR CLASS CONSTRUCTOR CHAINING CHILD
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// INITIATE THE CHILD CLASS - ALL THE CONTRUCTOR WILL GET CALLED WHILE INITATING CLASS
		ConstructorChainingChild CCC = new ConstructorChainingChild();
		CCC.Display();// CALLED THE DISPLAY METHOD TO DISPLAY THE MESSAGE
	}

}
