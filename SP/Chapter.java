package SPlab;

import java.util.ArrayList;

public class Chapter {
	String chTitle;
	ArrayList<SubChapter> subChapters=new ArrayList<SubChapter>();
	
	Chapter(String chTitle){
		this.chTitle=chTitle;
	}

	public int createSubChapter(String subChapterName) {
		SubChapter subCh = new SubChapter(subChapterName);
		subChapters.add(subCh);
		return subChapters.indexOf(subCh);
	}
	public SubChapter getSubChapter(int indexSubChapterOneOne) {
		return subChapters.get(indexSubChapterOneOne);
	}
	
	
}
