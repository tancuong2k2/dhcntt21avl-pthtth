package delete;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

public class DeleteDirTH3 {
	public boolean deleteListFileInFolder(String source) throws IOException {
		File folder = new File(source);
		// folder tồn tại
		if (folder.exists()) {
			// danh sách file
			File[] listFile = folder.listFiles();
			if (listFile.length != 0) {
				for (File f : listFile) {
					// neu la file thi delete
					if (f.isFile()) {
						f.delete();
					}
					// neu la thu muc thi goi de quy lai
					if (f.isDirectory()) {
						deleteListFileInFolder(f.getAbsolutePath());
					}
				}
			}
			folder.delete();
			System.out.println("Delete folder thanh công!");
			return true;
		} else {
			System.out.println("folder không tồn tại");
			return false;
		}
	}

	public static void main(String[] args) throws IOException {
		DeleteDirTH3 deleteDirTH3 = new DeleteDirTH3();
		deleteDirTH3.deleteListFileInFolder("D:/TAI LIEU HOC TAP/HK3/PHAT TRIEN HE THONG TICH HOP/TestDeleteDir");

	}
}