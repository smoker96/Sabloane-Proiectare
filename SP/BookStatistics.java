package SPlab;

public class BookStatistics implements Visitor {
	int numOfImages;
	int numOfParagraphs;
	int numOfTables;
	public void visit(Image i) {
		numOfImages++;
	}
	public void visit(ImageProxy imgProxy) {
		numOfImages++;
	}
	public void visit(Table t) {
		numOfTables++;
	}
	public void visit(Text text) {
		numOfParagraphs++;
	}
	public void printStatistics() {
		System.out.println("Book statistics:");
		System.out.print("*** Number of images:");
		System.out.println(numOfImages);
		System.out.print("*** Number of tables:");
		System.out.println(numOfTables);
		System.out.print("*** Number of paragraphs:");
		System.out.println(numOfParagraphs);
	}
	
}
