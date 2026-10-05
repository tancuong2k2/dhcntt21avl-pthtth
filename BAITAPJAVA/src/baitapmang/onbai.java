package baitapmang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class onbai {
	public static void main(String[] agrs) {
		Scanner nhap = new Scanner(System.in);
		
		//nhap phan tu
		System.out.print("Nhap vao so phan tu: ");
		int n = nhap.nextInt();
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		LinkedList<Integer> linkedList = new LinkedList<>();		
		
		System.out.println("Nhap cac so nguyen: ");
		for (int i = 0; i < n; i++) {
			int x = nhap.nextInt();
			arrayList.add(x);
			linkedList.add(x);
		}
		
		//Tinh toan Max, Min, Average, Std
		int min = Collections.min(arrayList);
		int max = Collections.max(arrayList);
		
		double sum = 0;
		for (int x : arrayList) sum += x;
	
		System.out.println("Min: "+ min);
		System.out.println("Max: "+ max);
		System.out.println("Sum: "+ sum);
	}
}
