package java_io.file;

import java.io.File;
import java.io.IOException;

public class Files {
	
	public static void main(String[] args)  throws IOException{
		
		
		File file = new File("arquivo_file.txt");
		file.createNewFile();
		System.out.println("Existe? " + file.exists());
		System.out.println("Permissao de leitura? " + file.canRead());
		
	}
	
}
