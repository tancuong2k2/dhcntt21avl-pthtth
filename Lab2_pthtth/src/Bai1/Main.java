package Bai1;

public class Main {
	public static void main(String[] args) {
		//Tạo sản phẩm
		SanPham sp1 = new SanPham("SP01", "Laptop", 1500, 10);
		SanPham sp2 = new SanPham("SP02", "Điện thoại", 800, 5);
		
		//Thông tin ban đầu
		System.out.println("Thông tin ban đầu:");
		sp1.hienThiThongTin();
		sp2.hienThiThongTin();
		
		// Nhập thêm hàng cho sp1
        System.out.println("\nNhập thêm hàng cho Laptop:");
        sp1.nhapHang(5);
        sp1.hienThiThongTin();

        // Bán hàng thành công
        System.out.println("\nBán 3 chiếc điện thoại:");
        sp2.banHang(3);
        sp2.hienThiThongTin();

        // Thử bán quá số lượng tồn kho
        System.out.println("\nThử bán 10 chiếc điện thoại:");
        sp2.banHang(10);
        sp2.hienThiThongTin();
	}
		
}
