package delete;

import java.io.File;

public class findFile {
	public void finFile(String source, String key) {
		File file = new File(source);
		if(file.exists()) {
			if(file.isFile()) {
				if(file.getName().endsWith(key)) {
					System.out.println(file.getAbsolutePath());
				}
			}
			File[] listFile = file.listFiles();
			if(listFile != null) {
				for (File f:listFile) {
					finFile(f.getAbsolutePath(), key);
				}
			}
		}else {
			System.out.println("source không tồn tại");
		}
	}
	 public static void main(String[] args) { 
	        findFile finder = new findFile();
	     // Ví dụ: tìm file có đuôi ".java"
	        finder.finFile("D:/TAI LIEU HOC TAP/HK3/PHAT TRIEN HE THONG TICH HOP/find", ".txt");
	    }
}
