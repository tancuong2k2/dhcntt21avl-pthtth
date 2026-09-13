package Bai2;

public class GiangVien extends Nguoi {
	private String maGiangVien;
	private String chuyenMon;
	private double luongCoBan;
	private double heSoLuong;

	// Constructor gọi super
	public GiangVien(String hoTen, int namSinh, String diaChi, String maGiangVien, String chuyenMon, double luongCoBan,
			double heSoLuong) {
		super(hoTen, namSinh, diaChi);
		this.maGiangVien = maGiangVien;
		this.chuyenMon = chuyenMon;
		this.luongCoBan = luongCoBan;
		this.heSoLuong = heSoLuong;
	}

	// Phương thức tính lương
	public double tinhLuong() {
		return luongCoBan * heSoLuong;
	}

	// Ghi đè hiển thị thông tin
	@Override
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("Mã GV: " + maGiangVien + ", Chuyên môn: " + chuyenMon + ", Lương cơ bản: " + luongCoBan
				+ ", Hệ số lương: " + heSoLuong + ", Lương: " + tinhLuong());
	}

}
