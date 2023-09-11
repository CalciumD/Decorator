package labs6;

public abstract class PrinterDecorator implements Printer {

	private Printer printer;
	//constructor
	public PrinterDecorator(Printer p) {
		this.printer  = p;
	}

	@Override
	public void print(String s) {
		System.out.print(s);
	}
	

}
