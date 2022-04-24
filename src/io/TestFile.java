package io;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

public class TestFile {

	public static void main(String[] args) {

		File dir = new File("C:\\eclipse");
		
		File[] files = dir.listFiles();
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");//放在for:each迴圈的話，會使每次新增一個file時都需要新增一個date format物件
		int counter = 0;
		long size = 0;
		for (File file : files) {
			long lastModified = file.lastModified();
			Date date = new Date(lastModified);
			System.out.printf("%s:%s,修改時間:%s%n",file.isDirectory()?"目錄":"檔名",file.getName(),format.format(date));
			if(!file.isDirectory()) {
				counter++;
				size = size + file.length();//file.length可以存檔案大小
			}
			System.out.printf("檔案個數:%d,檔案大小總和:%d%n",counter, size);
		}
	}

}
