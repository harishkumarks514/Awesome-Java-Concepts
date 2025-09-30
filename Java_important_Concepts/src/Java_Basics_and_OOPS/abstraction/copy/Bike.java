package Java_Basics_and_OOPS.abstraction.copy;

//code1 Abstract class and abstract method
abstract class Bike {
	abstract void run();
}

class Honda4 extends Bike {
	void run() {
		System.out.println("running safely..");
	}

	public static void main(String args[]) {
		Bike obj = new Honda4();
		obj.run();
	}
}