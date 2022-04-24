package io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) {

		//JDBC會使用到
		//使fis這個變數可以被整個main方法使用
		//區域變數後面需要進行initialized
			
		try ( FileInputStream fis = new FileInputStream("C:/java/io_1.txt"); 
				BufferedInputStream bis = new BufferedInputStream(fis);) 
		{
			System.out.println("available= "+bis.available());
			
			int b= bis.read();//讀一個byte
			char c = (char) b; //把byte值轉成char(字)
			System.out.println("byte值="+b);//ascii table
			System.out.println(c);
			
			while ((b =bis.read()) != -1) {
				c = (char) b; 
				System.out.println(c);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		
	}

}
