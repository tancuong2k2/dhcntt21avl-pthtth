package delete;

import java.io.File;

public class deleteFolder {
	public boolean deleteEmptyFolder(String source) {
		File folder = new File(source);
		// kiem tra neu folder ton tai thi xoa
		if (folder.exists()) {
			folder.delete();
			System.out.println("folder ton tai\n xoa folder thanh cong");
			return true;
		} else {
			System.out.println("folder khong ton tại");
		}
		return false;
	}
	public static void main(String[] args) {
		deleteFolder deleteFolder = new deleteFolder();
		deleteFolder.deleteEmptyFolder("D:/TAI LIEU HOC TAP/HK3/PHAT TRIEN HE THONG TICH HOP/demo");
	}
}
