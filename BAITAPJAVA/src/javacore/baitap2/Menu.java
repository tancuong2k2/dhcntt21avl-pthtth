package javacore.baitap2;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		System.out.println("CACULATOR PROGRAM");
		Scanner scanner = new Scanner(System.in);
		double x, y;
		char cont = 'c';
		do {
			System.out.print("Nhap toan han x = ");
			x = scanner.nextDouble();
			System.out.print("Nhap toan han y = ");
			y = scanner.nextDouble();
			System.out.println("Nhap phep toan +/-/*/: ");
			char op = scanner.next().charAt(0);
			switch (op) {
			case '+':
				System.out.println("x + y = " + (x + y));
				break;
			case '-':
				System.out.println("x - y = " + (x - y));
				break;
			case '*':
				System.out.println("x * y = " + (x * y));
				break;
			case ':':
				System.out.println("x / y = " + (x / y));
				break;
			}

			System.out.println("Ban co muon tiep tuc ? (c/k) :");

			cont = scanner.next().charAt(0);

		} while (cont != 'k');
		scanner.close();
	}
}
