package Comparable.copy;

//Java program to demonstrate lambda expressions
//to implement a user defined functional interface.

//A sample functional interface (An interface with
//single abstract method
interface FuncInterface {
//		An abstract function
	void abstractFun(int x);

//	 A non abstract function
	default void normalFun() {
		System.out.println("Hello");
	}
}

class test {
	public static void main(String[] args) {
//		Lambda Expression to implement above 
//		functional interface. This interface 
//		by default implements abstractFun() 
		
		FuncInterface fobj = (int x) -> System.out.println(2*x);
		
		fobj.abstractFun(5);
		
	}
}