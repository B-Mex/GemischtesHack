package zählschleifen;

import java.util.Scanner;

public class SumNb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 0;
		int sumb = 0;

		Scanner input = new Scanner(System.in);

		System.out.println("Geben Sie einen Wert für 'n' ein: ");
		n = input.nextInt();

		input.close();

		for (int i = 1; i <= ((2 * n) - 1); i += 2) {

			sumb += i * i;

		}
		System.out.println(sumb);

	}

}
