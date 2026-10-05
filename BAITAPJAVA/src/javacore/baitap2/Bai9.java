package javacore.baitap2;

public class Bai9 {
	//Chay ra man hinh gia tri nhi phan
	static int nhiphan[] = new int[4];

	public static void xuatgtri(int n) {
		if (n == 4) {
			for (int i = 0; i < 4; i++)
				System.out.print(nhiphan[i]);
			System.out.println();
		} else {
			nhiphan[n] = 0;
			xuatgtri(n + 1);
			nhiphan[n] = 1;
			xuatgtri(n + 1);
		}
	}

	public static void main(String[] args) {
		xuatgtri(0);
	}
}
