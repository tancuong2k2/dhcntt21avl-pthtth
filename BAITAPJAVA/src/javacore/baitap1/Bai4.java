package javacore.baitap1;

import java.util.Iterator;

public class Bai4 {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) { //10 dong
			for (int j = 1; j <= 10; j++) { //10 cot
				if (i==1 || j==1 || i==10 || j==10) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
