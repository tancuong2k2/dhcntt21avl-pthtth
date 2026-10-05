package javacore.baitap1;

import java.util.Scanner;

public class Bai5 {
	
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) { //10dong
			for (int j = 1; j <= 10; j++) { //10cot
				if (i==1 || j==1 || i==10 || j==10 || i==j || i+j==11) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
