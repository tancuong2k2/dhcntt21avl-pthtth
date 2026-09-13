package baitaplab1b;

import java.util.Scanner;

public class Person {

	private String ten;
	private String gioiTinh;
	private String ngaySinh;
	private String diaChi;

	// Constructor không tham số
	public Person() {
	}

	// Constructor đầy đủ tham số
	public Person(String ten, String gioiTinh, String ngaySinh, String diaChi) {
		this.ten = ten;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
	}

	// Getter & Setter
	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	// Nhập thông tin
	public void inputInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Tên: ");
		ten = sc.nextLine();
		System.out.print("Giới tính: ");
		gioiTinh = sc.nextLine();
		System.out.print("Ngày sinh: ");
		ngaySinh = sc.nextLine();
		System.out.print("Địa chỉ: ");
		diaChi = sc.nextLine();
	}

	// Xuất thông tin
	public void printInfo() {
		System.out.println(
				"Tên: " + ten + ", Giới tính: " + gioiTinh + ", Ngày sinh: " + ngaySinh + ", Địa chỉ: " + diaChi);
	}

}
