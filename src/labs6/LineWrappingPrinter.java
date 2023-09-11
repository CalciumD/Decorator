package labs6;

public class LineWrappingPrinter implements Printer {
	
	
	public LineWrappingPrinter(Printer p) {
		if(p != null) {
			if(p.toString().length() == 5) {
				p.print("\n");
			}
		}
		
	}
	
	@Override
	public void print(String s) {
		System.out.print(s);
	}

	
}
