package ExampleJava;

import java.util.Scanner;

public class Example3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Vui lòng nhập số hạng thứ nhất: ");
		int soA = scanner.nextInt();
		System.out.println("Vui lòng nhập số hạng thứ hai: ");
		int soB = scanner.nextInt();
		int kq = soA + soB;
		System.out.println("Tính tổng: " + soA + "+" + soB + "=" + kq);
	}
}
