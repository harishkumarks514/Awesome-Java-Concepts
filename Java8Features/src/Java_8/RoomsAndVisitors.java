package Java_8;

import java.util.Scanner;

public class RoomsAndVisitors {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of visitors : ");

		int visitors = sc.nextInt();

		System.out.println("Enter the number of rooms");

		int rooms = sc.nextInt();

		// Base Distrubution
		int sourse = visitors / rooms;
		int remainder = visitors % rooms;

		int[] dist = new int[rooms];

		// Fill remainder rooms with +1

		for (int i = 0; i < rooms; i++) {
			if (i < remainder) {
				dist[i] = sourse + 1;
			} else {
				dist[i] = sourse;
			}
		}
		

		System.out.print("Visitors per room : ");
		for (int i = 0; i < rooms; i++) {
			System.out.print(dist[i]);
			if (i < rooms - 1)
				System.out.print(" ");
		}
	}
}
