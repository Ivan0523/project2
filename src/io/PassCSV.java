package io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class PassCSV {

	public static void main(String[] args) {

		try(FileInputStream fis = new FileInputStream("c:/java/Employees.csv");      
			InputStreamReader isr = new InputStreamReader(fis,"UTF8");
			BufferedReader br = new BufferedReader(isr);	
				){
			
			String line;
			line = br.readLine();//多讀一行
			int sum = 0; 
			while ((line = br.readLine()) != null) {
				System.out.println(line);
				String[] fields = line.split(",");
				System.out.printf("姓名:%s,薪水:%s,年齡:%s%n",fields[1], fields[2],fields[3]);
				sum = sum + Integer.parseInt(fields[2]);//將文字轉型成數字，使用wrapper class
				}
			System.out.println("總和=" + sum);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
