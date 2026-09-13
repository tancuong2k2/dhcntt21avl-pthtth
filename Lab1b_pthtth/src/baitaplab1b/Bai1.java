package baitaplab1b;

public class Bai1 {
	// Lop Hinh Chu Nhat
	class HCN {
		private double dai;
		private double rong;

		// Contructor không tham số
		public HCN() {
			this.dai = 0;
			this.rong = 0;
		}

		// Contructor day du tham số
		public HCN(double dai, double rong) {
			this.dai = dai;
			this.rong = rong;
		}

		// Getter & Setter
		public double getDai() {
			return dai;
		}

		public void setDai(double dai) {
			this.dai = dai;
		}

		public double getRong() {
			return rong;
		}

		public void setRong(double rong) {
			this.rong = rong;
		}

		// Chu vi
		public double chuVi() {
			return (dai + rong) * 2;
		}

		// Dien Tich
		public double dienTich() {
			return dai * rong;
		}

		// Xuất thông tin
		public void xuat() {
			System.out.println("HCN: dai=" + dai + ", rong=" + rong + ", CV=" + chuVi() + ", DT=" + dienTich());
		}
	}

	// Lop Hinh Vuong
	class HVuong {
		private double canh;

		public HVuong() {
			this.canh = 0;
		}

		public HVuong(double canh) {
			this.canh = canh;
		}

		public double getCanh() {
			return canh;
		}

		public void setCanh(double canh) {
			this.canh = canh;
		}

		// Chu vi
		public double chuVi() {
			return 4 * canh;
		}

		// Diện tích
		public double dienTich() {
			return canh * canh;
		}

		// Xuất thông tin
		public void xuat() {
			System.out.println("HVuong: canh=" + canh + ", CV=" + chuVi() + ", DT=" + dienTich());
		}

	}

	// Lop Hinh Tam Giac
	class HTG {
		private double a, b, c;

		public HTG() {
			this.a = 0;
			this.b = 0;
			this.c = 0;
		}

		public HTG(double a, double b, double c) {
			this.a = a;
			this.b = b;
			this.c = c;
		}

		public double getA() {
			return a;
		}

		public void setA(double a) {
			this.a = a;
		}

		public double getB() {
			return b;
		}

		public void setB(double b) {
			this.b = b;
		}

		public double getC() {
			return c;
		}

		public void setC(double c) {
			this.c = c;
		}

		// Chu vi
		public double chuVi() {
			return a + b + c;
		}

		// Diện tích
		public double dienTich() {
			double p = chuVi() / 2;
			return Math.sqrt(p * (p - a) * (p - b) * (p - c));
		}

		// Xuất thông tin
		public void xuat() {
			System.out.println("HTG: a=" + a + ", b=" + b + ", c=" + c + ", CV=" + chuVi() + ", DT=" + dienTich());
		}
	}

	// Lớp Demo
	public class DemoHinh {
		public static void main(String[] args) {
			HCN hcn = new HCN(5, 3);
			HVuong hv = new HVuong(4);
			HTG ht = new HTG(3, 4, 5);

			hcn.xuat();
			hv.xuat();
			ht.xuat();
		}
	}
}
