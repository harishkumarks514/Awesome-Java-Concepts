package LambdaExpressions;

interface Geeks
{
	void display();
	}

public class ZeroParameters {
public static void main(String[] args) {
	//Lambda Expression with zero parameters
	Geeks geeks = () -> System.out.println("This is a zero-parameter lambda expression!");

	//Invoke the method
	geeks.display();
}
}

