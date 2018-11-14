package SPlab;

public class SPlab {

	public static void main(String[] args) throws Exception {
		Section cap1 = new Section("Capitolul 1");
		Text p1 = new Text("Paragraph 1");
		cap1.add(p1);
		Text p2 = new Text("Paragraph 2");
		cap1.add(p2);
		Text p3 = new Text("Paragraph 3");
		cap1.add(p3);
		Text p4 = new Text("Paragraph 4");
		cap1.add(p4);
		cap1.add(new ImageProxy("ImageOne"));
		cap1.add(new Image("ImageTwo"));
		cap1.add(new Text("Some text"));
		cap1.add(new Table("Table 1"));
			
		BookStatistics stats = new BookStatistics();
		cap1.accept(stats);
		stats.printStatistics();
	}

}
