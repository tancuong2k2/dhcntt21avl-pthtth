package Bai2;

public class Nguoi {
	// thuoc tinh
	private String hoTen;
	private int namSinh;
	private String diaChi;

	// constructor
	public Nguoi(String hoTen, int namSinh, String diaChi) {
		this.hoTen = hoTen;
		this.namSinh = namSinh;
		this.diaChi = diaChi;
	}

	// Getter & Setter
	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public int getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public int tinhTuoi() {
		int namHienTai = java.time.Year.now().getValue();
		return namHienTai - namSinh;
	}

	// Hien thi thong tin chung
	public void hienThiThongTin() {
		System.out.println(
				"Họ tên: " + hoTen + ", Năm sinh: " + namSinh + ", Địa chỉ: " + diaChi + ", Tuổi: " + tinhTuoi());
	}

}
