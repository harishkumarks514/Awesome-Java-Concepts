package Logics;

public class SwapWithoutTemp {

	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		
		i = i+ j;
		System.out.println(i);
		j=i-j;
		System.out.println(j);
		i=i-j;
		System.out.println(i);
		
	}
}
