package io;

import java.io.*;
import java.nio.charset.Charset;

public class ReadByFileReader {
    public static void main(String[] args) throws IOException {

        System.out.println("JVM Encoding＝"+Charset.defaultCharset());

        File file = new File("C:\\java\\char_MS950.txt");
        try(FileInputStream fis = new FileInputStream(file);
        	InputStreamReader isr = new InputStreamReader(fis,"MS950");
        	BufferedReader br = new BufferedReader(isr);	
        		){
            
        	String line;
        	while((line=br.readLine()) != null) {        		
        		System.out.println(line);
        	}
        	
        	
            //改成InputSteamReader
            /*  FileInputStream fis = new FileInputStream(file);
                InputStreamReader isr = new InputStreamReader(fis, "MS950");
                BufferedReader br = new BufferedReader(isr)
                */
            /*    
        	int c;
                while ((c = br.read()) != -1) {
                    System.out.println((char) c);
                }
            */
            //}

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
