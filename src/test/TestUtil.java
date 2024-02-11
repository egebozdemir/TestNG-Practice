package test;

public class TestUtil {
	
	int a;
	
	//parametrized constructor
	public TestUtil(int a) {
		this.a = a;
	}
	
	//default constructor
	public TestUtil() {
		
	}

	public int multiplyTwo() {
		a=a*2;
		return a;
	}
	
	public int dividedTwo() {
		a=a/2;
		return a;
	}

}
