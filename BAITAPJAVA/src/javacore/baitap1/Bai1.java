package javacore.baitap1;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap a: ");
		int a = sc.nextInt();
		System.out.print("Nhap b: ");
		int b = sc.nextInt();
		System.out.print("Nhap c: ");
		int c = sc.nextInt();

		int max = Math.max(a, Math.max(b, c));
		int min = Math.min(a, Math.min(b, c));

		System.out.println("Giá trị lớn nhất: " + max);
		System.out.println("Giá trị lớn nhất: " + min);
	}
}
