package baitapmang;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class baitapdemo {
	//Viet chuong trinh nhap vao 1 list so nguyen, xuat ra gia tri Min, Max,
	//Average, Std, Tim kiem, them, xoa voi ArrayList, LinkedList
	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		
		//Nhap phan tu
		System.out.print("Nhap vao so phan tu: ");
		int n = nhap.nextInt();
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		LinkedList<Integer> linkedList  = new LinkedList<>();
		
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
        double avg = sum / arrayList.size();

        double variance = 0;
        for (int x : arrayList) variance += Math.pow(x - avg, 2);
        double std = Math.sqrt(variance / arrayList.size());

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Average: " + avg);
        System.out.println("Std: " + std);
        
     // Tìm kiếm
        System.out.print("Nhập số cần tìm: ");
        int search = nhap.nextInt();
        if (arrayList.contains(search))
            System.out.println("Tìm thấy " + search + " trong ArrayList");
        else
            System.out.println("Không tìm thấy trong ArrayList");

        if (linkedList.contains(search))
            System.out.println("Tìm thấy " + search + " trong LinkedList");
        else
            System.out.println("Không tìm thấy trong LinkedList");

        // Thêm phần tử
        System.out.print("Nhập số cần thêm: ");
        int add = nhap.nextInt();
        arrayList.add(add);
        linkedList.add(add);
        System.out.println("ArrayList sau khi thêm: " + arrayList);
        System.out.println("LinkedList sau khi thêm: " + linkedList);
		
     // Xóa phần tử
        System.out.print("Nhập số cần xóa: ");
        int remove = nhap.nextInt();
        arrayList.remove(Integer.valueOf(remove));
        linkedList.remove(Integer.valueOf(remove));
        System.out.println("ArrayList sau khi xóa: " + arrayList);
        System.out.println("LinkedList sau khi xóa: " + linkedList);

        nhap.close();
	}
}
