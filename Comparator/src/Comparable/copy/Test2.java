package Comparable.copy;


interface FuncInterface1{
	int operation(int a, int b);
}

public class Test2 {
public static void main(String[] args) {
//	using the lambda expression to define the operations
	
	FuncInterface1 add = (a,b) -> a + b;
	FuncInterface1 multiplay = (a,b) -> a * b;
	
	//using the operations 
	System.out.println(add.operation(3, 6));
	System.out.println(multiplay.operation(5, 2));
}
	
}