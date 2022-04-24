package io;
//lab 練習
import java.io.File;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		
		Comparator<File> comparator = new Comparator<File>() {

			@Override
			public int compare(File o1, File o2) {
				if (o1.length() < o2.length()) {
					return -1;	
				}else if (o1.length() > o2.length()) {
					return 1;
				}else {
					return 0; 
				}
			}
			
		};
		
		File dir  = new File("C:\\eclipse");
		File[] list = dir.listFiles();
		Set<File> treeSet = new TreeSet<File>(comparator);
		
		for (File file : list) {
			//isDirectory可以用來判斷是否是目錄，透過!將false轉成true，並成功加入檔案
			if(!file.isDirectory()) {
				treeSet.add(file);
			}
		}
		
		for (File set : treeSet) {
			System.out.printf("檔案名稱:%s 檔案大小:%d%n",set.getName(),set.length());
		}
	}

}
