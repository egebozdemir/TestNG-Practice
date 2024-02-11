package test;

import org.testng.annotations.Test;

public class TestChild extends TestParent {

	@Test
	public void childTestRun() {
		//by inheritance - parent class method
		doThis(); 
		
		//by creating instance with calling default constructor
		TestHelper th = new TestHelper(); 
		System.out.println(th.increment(3));
		System.out.println(th.decrement(3));
		
		//by creating instance with calling parameterized constructor
		TestHelper th1 = new TestHelper(3); 
		System.out.println(th1.incrementParam());
		System.out.println(th1.decrementParam());
		System.out.println(th1.decrementParam());
		System.out.println(th1.decrementParam());
		System.out.println(th1.decrementParam());
		
		System.out.println(th.increment(5));
		System.out.println(th.decrement(5));
		
		System.out.println(th1.incrementParam());
		System.out.println(th1.decrementParam());
		
		//by using the parent class methods of the created object's class
		System.out.println(th1.multiplyTwo()); 
		System.out.println(th1.dividedTwo()); 
		
	}
	
}
