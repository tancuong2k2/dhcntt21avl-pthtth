package javacore.baitap2;

import java.util.Iterator;
import java.util.Scanner;

public class Bai7 {
	public static void main(String[] args) {
		int n;
		Scanner nhap = new Scanner(System.in); // scaner la lop trong thu vien java.util
		System.out.println("Nhap vao so phan tu: ");
		n = nhap.nextInt(); // doc so nguyen nhap vao, va gan vao bien n
		int dayso[] = new int[n]; // khai bao mang, tao ra mang nhap vao tu ban phim
		for (int i = 0; i < n; i++) {
			System.out.print("Nhap so phan tu thu " + (i + 1) + ":");
			dayso[i] = nhap.nextInt();
		}
		System.out.println("Day so vua nhap vao la:");
		for (int i = 0; i < n; i++)
			System.out.print(dayso[i] + " ");

		System.out.println();
		System.out.println("Day so sau khi sap xep tang dan: ");
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (dayso[i] > dayso[j]) {
					int temp = dayso[i];
					dayso[i] = dayso[j];
					dayso[j] = temp;
				}
			}

		}
		for (int i = 0; i < n; i++)
			System.out.print(dayso[i] + " ");
		nhap.close();
	}
}
