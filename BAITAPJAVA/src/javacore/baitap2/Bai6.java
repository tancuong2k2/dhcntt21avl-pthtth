package javacore.baitap2;

import java.util.Iterator;
import java.util.Scanner;

public class Bai6 {
	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		System.out.print("Nhập vào số phần tử: ");
		int n = nhap.nextInt(); // nhập số lượng phần tử

		int dayso[] = new int[n]; // khai báo mảng có n phần tử

		for (int i = 0; i < n; i++) {
			System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
			dayso[i] = nhap.nextInt();
		}

		System.out.println("Day so vua nhap vao la:");
		for (int i = 0; i < n; i++) {
			System.out.print(dayso[i] + " ");
		}

		// khoi tao gia tri ban dau
		int max = dayso[0];
		int min = dayso[0];
		int Sum = dayso[0];

		// duyet mang de tim max, min, trung binh
		for (int i = 0; i < n; i++) {
			if (dayso[i] > max)
				max = dayso[i];
			if (dayso[i] < min)
				min = dayso[i];
			Sum = Sum + dayso[i];
		}

		// tinh trung binh
		double average = Sum * 1.0 / n;

		// hien thi ket qua
		System.out.println();
		System.out.println("Giá trị lớn nhất = " + max);
		System.out.println("Giá trị nhỏ nhất = " + min);
		System.out.println("Giá trị trung bình = " + average);
		nhap.close();
	}
}
