package baitaplab1b;

import java.util.Scanner;

public class Student extends Person {
	private double diemTB;
	private String email;

	public Student() {
	}

	public Student(String ten, String gioiTinh, String ngaySinh, String diaChi, double diemTB, String email) {
		super(ten, gioiTinh, ngaySinh, diaChi);
		this.diemTB = diemTB;
		this.email = email;
	}

	public double getDiemTB() {
		return diemTB;
	}

	public void setDiemTB(double diemTB) {
		this.diemTB = diemTB;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public void inputInfo() {
		super.inputInfo();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Điểm trung bình (0.0 - 10.0): ");
			diemTB = sc.nextDouble();
		} while (diemTB < 0.0 || diemTB > 10.0);

		sc.nextLine(); // bỏ dòng thừa
		do {
			System.out.print("Email: ");
			email = sc.nextLine();
		} while (!email.contains("@") || email.contains(" "));
	}

	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("Điểm TB: " + diemTB + ", Email: " + email);
	}

	public boolean coHocBong() {
		return diemTB > 8.0;
	}

}
