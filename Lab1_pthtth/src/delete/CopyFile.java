package delete;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
	public boolean copyFile(String source, String dest) throws FileNotFoundException, IOException {
//       file nguồn 
		File sourceFile = new File(source);
//       file đích 
		File destFile = new File(dest);
//       kiem tra file nguồn có tồn tại không 
		if (sourceFile.exists()) {
//          luồng đọc file 
			FileInputStream fis = new FileInputStream(sourceFile);
//          luồng ghi file 
			FileOutputStream fos = new FileOutputStream(destFile);
			byte[] arr = new byte[1024];
			while ((fis.read(arr)) != -1) {
				fos.write(arr);
				fos.flush();
			}
			fis.close();
			fos.close();
			System.out.println("copy thành công");
			return true;
		} else {
			System.out.println("file nguồn không tồn tại");
			return false;
		}
	}
	public static void main(String[] args) {
        CopyFile copier = new CopyFile();
        try {
            // 🟢 Thêm đường dẫn nguồn và đích ở đây
            String sourcePath = "D:/TAI LIEU HOC TAP/HK3/PHAT TRIEN HE THONG TICH HOP/source/source.txt";
            String destPath = "D:/TAI LIEU HOC TAP/HK3/PHAT TRIEN HE THONG TICH HOP/find/des.txt";

            copier.copyFile(sourcePath, destPath);
        } catch (IOException e) {
            System.out.println("Có lỗi xảy ra: " + e.getMessage());
        }
    }
}
