package labs6;


public class Start {

	public static void main(String[] args) {
		
		Printer p = null;
		//UpperCasePrinter up = new UpperCasePrinter(p);
		//up.print("sssssss");
				
		LineWrappingPrinter ln = new LineWrappingPrinter(p);
		ln.print("hello my\nname is\nbob and\ni live\nin a tree\nhouse with\nmy pet\ndog doug");
		
	}

}
