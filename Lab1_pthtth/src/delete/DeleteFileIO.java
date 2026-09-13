package delete;

import java.io.File;

public class DeleteFileIO {
	private void deleteFile(String source) {
		// new file
		File file = new File(source);
		// kiem tra file co ton tai khong
		// neu ton tai
		if (file.exists()) {
			System.out.println("file da ton tai");
			file.delete();
		} else {
			System.out.println("file khong ton tai");
		}
	}

	public static void main(String[] args) {
		DeleteFileIO deleteFileIO = new DeleteFileIO();
		deleteFileIO.deleteFile("D:/TAI LIEU HOC TAP/HK3/PHAT TRIEN HE THONG TICH HOP/demo.txt");
	}
}
