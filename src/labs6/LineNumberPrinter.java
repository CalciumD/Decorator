package labs6;

public class LineNumberPrinter extends PrinterDecorator {

	public LineNumberPrinter(Printer p) {
		super(p);
		
	}

	@Override
	public void print(String s) {
		super.print(s.lines().toString());
	}
	
	
}
