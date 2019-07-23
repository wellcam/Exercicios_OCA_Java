package java_io.output;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteFile {

	public static void main(String[] args) throws IOException{
		
		FileOutputStream fos = new FileOutputStream("meu_arquivo.txt", true);
		PrintWriter pw = new PrintWriter(fos);
		
		
		pw.println("I lova Java");
		pw.println(56);
		
		pw.close();
	}
	
}
