package zählschleifen;

import java.util.Scanner;

public class Ungerade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int min = 0;
		int max = 0;

		Scanner input = new Scanner(System.in);

		System.out.println("Geben Sie nacheinander die Zahlen für 'Min' und 'Max' ein: ");
		min = input.nextInt();
		max = input.nextInt();

		input.close();

		if (min > max) {
			int temp = max;
			max = min;
			min = temp;
		}
		for (int i = min; i <= max; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}

		}
		// } else {
		// for (int i = max; i <= min; i++) {
		// if (i % 2 == 1) {
		// System.out.println(i);
		// }
		// }

	}
}
