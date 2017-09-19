//PROGRAM TO ILLUSTRATE THE CONTRUCTOR CHAINING
//CLASS CONSTRUCTOR CHAINING
public class ConstructorChaining {

	// CONSTRUCTOR WITH NO PARATMETER
	public ConstructorChaining() {
		//JUST PRINTS THE MESSAGE
		System.out.println("Master Constructor");
	}
	// CONSTRUCTOR WITH ONE PARATMETER
	public ConstructorChaining(int a) {
		this();// CALLS CONSTRUCTOR WITH NO PARAMETER
		System.out.println("Called no paramenter Master class constructor");
	}
	// CONSTRUCTOR WITH TWO PARATMETER
	public ConstructorChaining(int a,int b) {
		this(5);// CALLS CONSTRUCTOR WITH 1 PARAMETER
		System.out.println("Called one paramenter Master class constructor");
	}
	// CONSTRUCTOR WITH THREE PARATMETER
	public ConstructorChaining(int a,int b,int c) {
		this(3,5); // CALLS CONSTRUCTOR WITH 2 PARAMETER
		System.out.println("Called two paramenter Master class constructor");
	}

}
