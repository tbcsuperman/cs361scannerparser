
/**
 * @author scharffc
 * 
 */
public class ScannerDemo {
	// This needs to be changed !
	private static String file1 = "./prog1.kay";
	private static int counter = 1;

	public static void main(String args[]) {
		TokenStream ts = new TokenStream(file1);
		System.out.println(file1);
		while (!ts.isEndofFile()) {
			// TO BE COMPLETED
			Token tk = ts.nextToken();
			System.out.println("Token " + counter++ + " - Type: " + tk.getType() + " - Value: " + tk.getValue());
		}
	}
}
