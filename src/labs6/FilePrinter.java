package labs6;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FilePrinter implements Printer {

	File fileone = new File("Printing.txt");
	
	public FilePrinter(Printer p) throws IOException {
		FileWriter newWrite = new FileWriter(fileone);
		newWrite.write(p.toString());
		newWrite.close();
	}
	
	@Override
	public void print(String s) {
		System.out.print(s);
	}

}
