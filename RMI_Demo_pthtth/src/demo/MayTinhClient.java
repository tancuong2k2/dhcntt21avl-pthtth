package demo;

import java.rmi.Naming;

public class MayTinhClient {
	public static void main(String[] args) {
		try {
			// Lấy đối tượng từ registry
            MayTinh mt = (MayTinh) Naming.lookup("rmi://localhost:1099/MayTinhObj");

            int tong = mt.cong2so(5, 6);
            System.out.println("Kết quả cộng 2 số từ MayTinh: " + tong);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
