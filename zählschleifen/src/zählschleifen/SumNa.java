package zählschleifen;

import java.util.Scanner;

public class SumNa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 0;
		int summe = 0;

		Scanner input = new Scanner(System.in);

		System.out.println("Geben Sie eine Zahl für 'n' ein: ");
		n = input.nextInt();

		input.close();

		for (int i = 1; i <= n; i++) {
			summe += i * i;

		}
		System.out.println("Summe: " + summe);

	}

}
