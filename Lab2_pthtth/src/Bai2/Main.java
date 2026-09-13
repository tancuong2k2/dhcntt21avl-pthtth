package Bai2;

public class Main {
	public static void main(String[] args) {
		// Tạo sinh viên
		SinhVien sv1 = new SinhVien("Nguyen Van A", 2003, "HCM", "SV001", "CNTT", 8.7);
		SinhVien sv2 = new SinhVien("Tran Thi B", 2004, "Hà Nội", "SV002", "Kinh tế", 6.5);

		// Tạo giảng viên
		GiangVien gv1 = new GiangVien("Le Van C", 1980, "Đà Nẵng", "GV001", "Toán học", 5000000, 3.0);
		GiangVien gv2 = new GiangVien("Pham Thi D", 1975, "HCM", "GV002", "Kinh tế", 6000000, 2.5);

		// Hiển thị thông tin
		System.out.println("=== Thông tin Sinh viên ===");
		sv1.hienThiThongTin();
		sv2.hienThiThongTin();

		System.out.println("\n=== Thông tin Giảng viên ===");
		gv1.hienThiThongTin();
		gv2.hienThiThongTin();
	}
}
