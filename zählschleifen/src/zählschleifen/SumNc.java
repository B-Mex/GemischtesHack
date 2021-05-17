package zählschleifen;

import java.util.Scanner;

public class SumNc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
		int sumc = 0;

		Scanner input = new Scanner(System.in);

		System.out.println("Geben Sie einen Wert für 'n' ein: ");
		n = input.nextInt();

		input.close();

		for (int i = 0; i <= 2 * n; i += 2) {
			sumc += i * i;
		}

		System.out.println(sumc);
	}

}
