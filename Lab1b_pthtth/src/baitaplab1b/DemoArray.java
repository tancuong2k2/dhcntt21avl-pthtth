package baitaplab1b;

public class DemoArray {
	public static void main(String[] args) {
		ArrayInt a = new ArrayInt(5);
		a.nhapMang();
		a.xuatMang();

		a.themDau(99);
		a.xuatMang();

		a.themCuoi(77);
		a.xuatMang();

		a.themGiua(55, 3);
		a.xuatMang();

		a.xoaPhanTu(99);
		a.xuatMang();

		a.xoaTheoViTri(2);
		a.xuatMang();

		a.radixSort(true);
		System.out.println("Sau khi sắp xếp tăng dần:");
		a.xuatMang();

		int b = 55;
		int pos1 = a.timKiemTuyenTinh(b);
		System.out.println("Tìm tuyến tính " + b + ": " + (pos1 >= 0 ? "vị trí " + pos1 : "không thấy"));

		int pos2 = a.timKiemNhiPhan(b);
		System.out.println("Tìm nhị phân " + b + ": " + (pos2 >= 0 ? "vị trí " + pos2 : "không thấy"));
	}
}
