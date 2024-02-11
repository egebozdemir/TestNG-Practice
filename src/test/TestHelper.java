package test;

public class TestHelper extends TestUtil{

	int a;
	
	//default constructor
	public TestHelper() {
		super(); //parent class default constructor is invoked
	}
	
	//parameterized constructor
	public TestHelper(int a) {
		super(a); //parent class parametrized constructor is invoked
		this.a = a;
	}

	public int increment(int a) {
		a=a+1;
		return a;
	}
	
	public int decrement(int a) {
		a=a-1;
		return a;
	}
	
	public int incrementParam() { //no instance variable passed, last value of class variable "a" is used
		a=a+1;
		return a;
	}
	
	public int decrementParam() { //no instance variable passed, last value of class variable "a" is used
		a=a-1;
		return a;
	}
}
