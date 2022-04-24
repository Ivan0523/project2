package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class DownloadImage {
	
	public static void main(String[] args) throws MalformedURLException {
		
		URL url = new URL("https://graph.facebook.com/AppStore/picture?type=large");
		try(InputStream is = url.openStream();
				BufferedInputStream bis = new BufferedInputStream(is);
				FileOutputStream fos = new FileOutputStream("c:/java/1.jpg");
				BufferedOutputStream bos = new BufferedOutputStream(fos);) 
		{
			
		  byte[] buffer = new byte[1024];//設定每次資料傳輸的大小上限，可自行設定，但是設定月大會對於記憶體產生壓力
		  int length; 
		  while ((length = bis.read(buffer)) != -1) {
			  System.out.println("length="+length);
			  bos.write(buffer,0,length);
		  }
		  
		  System.out.println("done");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
	
	
	
	
}
