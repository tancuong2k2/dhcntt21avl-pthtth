package demo;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MayTinhServer {
	public static void main(String[] args) {
		try {
			MayTinhImpl mt = new MayTinhImpl();
				
			// Khởi động registry trên cổng 1099
            LocateRegistry.createRegistry(1099);

            // Đăng ký đối tượng với tên "MayTinhObj"
            Naming.rebind("rmi://localhost:1099/MayTinhObj", mt);
				
            System.out.println("RMI Server da duoc dang ky tren registry cong 1099");
		}catch(

	Exception e)
	{
		// TODO: handle exception
		e.printStackTrace();
	}
}
}
