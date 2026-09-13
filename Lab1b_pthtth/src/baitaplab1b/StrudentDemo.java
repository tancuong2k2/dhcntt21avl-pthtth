package baitaplab1b;

import java.util.Scanner;

public class StrudentDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số lượng sinh viên: ");
		int n = sc.nextInt();
		sc.nextLine();

		Student[] sv = new Student[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Nhập thông tin SV " + (i + 1));
			sv[i] = new Student();
			sv[i].inputInfo();
		}

		System.out.println("\n--- Danh sách sinh viên ---");
		for (Student s : sv)
			s.printInfo();

		// SV có điểm cao nhất và thấp nhất
		Student max = sv[0], min = sv[0];
		for (Student s : sv) {
			if (s.getDiemTB() > max.getDiemTB())
				max = s;
			if (s.getDiemTB() < min.getDiemTB())
				min = s;
		}
		System.out.println("\nSV điểm cao nhất:");
		max.printInfo();
		System.out.println("SV điểm thấp nhất:");
		min.printInfo();

		// SV được học bổng
		System.out.println("\n--- SV được học bổng ---");
		for (Student s : sv) {
			if (s.coHocBong())
				s.printInfo();
		}
	}

}
