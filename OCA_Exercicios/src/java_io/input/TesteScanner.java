package java_io.input;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TesteScanner {
	
	public static void main(String[] args) throws IOException{
		
		Scanner s = new Scanner(new File("contas.csv"));
		
		while(s.hasNext()) {
			System.out.println(s.nextLine());
		}
		
		s.close();
	}

}
