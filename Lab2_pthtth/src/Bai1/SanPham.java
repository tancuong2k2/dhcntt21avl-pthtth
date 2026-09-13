package Bai1;

public class SanPham {
	// Thuộc tính (đóng gói bằng private)
	private String maSanPham;
	private String tenSanPham;
	private double donGia;
	private int soLuong;

	// constructor
	public SanPham(String maSanPham, String tenSanPham, double donGia, int soLuong) {
		this.maSanPham = maSanPham;
		this.tenSanPham = tenSanPham;
		this.donGia = donGia;
		this.soLuong = soLuong;
	}

	// getter
	public String getMaSanPham() {
		return maSanPham;
	}

	public String getTenSanPham() {
		return tenSanPham;
	}

	public double getDonGia() {
		return donGia;
	}

	public int getSoLuong() {
		return soLuong;
	}

	// xay dung cac phuong thuc
	public double tinhThanhTien() {
		return donGia * soLuong;

	}

	public void nhapHang(int soLuongNhap) {
		if (soLuongNhap > 0) {
			soLuong += soLuongNhap;
			System.out.println("Đã nhập thêm " + soLuongNhap + " sản phẩm.");
		} else {
			System.out.println("Số lượng nhập phải lớn hơn 0!");
		}
	}

	public boolean banHang(int soLuongBan) {
		if (soLuongBan > 0 && soLuongBan <= soLuong) {
			soLuong -= soLuongBan;
			System.out.println("Đã bán " + soLuongBan + " sản phẩm.");
			return true;
		} else {
			System.out.println("Không đủ hàng hoặc số lượng bán không hợp lệ");
			return false;
		}
	}

	public void hienThiThongTin() {
		System.out.println("Mã sản phẩm: " + maSanPham + ", Tên sản phẩm: " + tenSanPham + ", Đơn giá: " + donGia
				+ ", Số lượng tồn kho: " + soLuong);
	}

}
