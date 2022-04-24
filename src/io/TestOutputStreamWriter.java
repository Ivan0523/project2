package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class TestOutputStreamWriter {

	public static void main(String[] args) {
		
		try(FileOutputStream fos = new FileOutputStream("c:/java/2.txt");
			OutputStreamWriter osw = new OutputStreamWriter(fos,"MS950");
				
				){
			
			osw.write("中文測試");
			osw.flush(); //buffer沒滿，但要強制寫出
			System.out.println("done");
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
				
		
		
	}

}
