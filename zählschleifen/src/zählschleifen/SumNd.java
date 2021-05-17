package zählschleifen;

import java.util.Scanner;

public class SumNd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float n = 0;
		float sumd = 0;

		Scanner input = new Scanner(System.in);

		System.out.println("Geben Sie einen Wert für 'n' ein: ");
		n = input.nextInt();

		input.close();

		for (float i = 1; i <= n; i++) {
			sumd += 1 / i;

		}

		System.out.println(sumd);

	}

}
