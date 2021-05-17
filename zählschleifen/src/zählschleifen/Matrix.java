package zählschleifen;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int zif = 0;
		int grenz = 9;

		Scanner input = new Scanner(System.in);

		System.out.println("Geben Sie eine Ziffer zwischen 2 und 9 ein: ");
		zif = input.nextInt();

		input.close();

		for (int i = 0; i < 100; i++) {
			if (i % zif != 0) {
				if (i == grenz) {
					System.out.println(i);
					grenz += 10;
				} else if (i < 9) {
					System.out.print(i + "  ");

				} else {
					System.out.print(i + " ");
				}
			} else {
				if (i % zif == 0) {
					if (i == grenz) {
						System.out.println("*");
						grenz += 10;
					} else if (i < 9) {
						System.out.print("*" + " ");

					} else {
						System.out.print("*" + " ");
					}
					System.out.println("Pimml");
				}
			}
		}
	}

}


