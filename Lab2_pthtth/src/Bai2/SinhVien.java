package Bai2;

public class SinhVien extends Nguoi{
	    private String maSinhVien;
	    private String nganhHoc;
	    private double diemTrungBinh;

	    // Constructor gọi super
	    public SinhVien(String hoTen, int namSinh, String diaChi,
	                    String maSinhVien, String nganhHoc, double diemTrungBinh) {
	        super(hoTen, namSinh, diaChi);
	        this.maSinhVien = maSinhVien;
	        this.nganhHoc = nganhHoc;
	        this.diemTrungBinh = diemTrungBinh;
	    }

	    // Ghi đè phương thức hiển thị
	    @Override
	    public void hienThiThongTin() {
	        super.hienThiThongTin();
	        System.out.println("Mã SV: " + maSinhVien +
	                           ", Ngành học: " + nganhHoc +
	                           ", Điểm TB: " + diemTrungBinh +
	                           ", Xếp loại: " + xepLoai());
	    }

	    // Phương thức xếp loại
	    public String xepLoai() {
	        if (diemTrungBinh >= 8.5) return "Giỏi";
	        else if (diemTrungBinh >= 7.0) return "Khá";
	        else if (diemTrungBinh >= 5.0) return "Trung bình";
	        else return "Yếu";
	    }

}
