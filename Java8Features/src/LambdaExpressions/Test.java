package LambdaExpressions;

public class Test {

	public static void main(String[] args) {
		//Lambda expression to implement above functional interface.
		FuncInterface fobj=  (int x)-> System.out.println(2*x);
		
		//This calls above lambda expression and prints 10.
		fobj.abstractFun(5);
	}
}

interface FuncInterface
{
// An abstract function
	void abstractFun(int x);
	
	//a non-Abstract function
	default void normal()
	{
		System.out.println("Hello");
	}
	
}
