package SPlab;

import java.util.ArrayList;

public class SubChapter {
	String subChTitle;
	ArrayList<Table> tables=new ArrayList<Table>();
	ArrayList<Image> images=new ArrayList<Image>();
	ArrayList<Text> paragraphs=new ArrayList<Text>();
	
	SubChapter(String subChTitle){
		this.subChTitle=subChTitle;
	}

	public void createNewParagraph(String prgName) {
		Text paragraph = new Text(prgName);
		paragraphs.add(paragraph);
	}
	public void createNewImage(String imgName) {
		Image image = new Image(imgName);
		images.add(image);
	}
	public void createNewTable(String tableName) {
		Table table = new Table(tableName);
		tables.add(table);
	}
	
}
