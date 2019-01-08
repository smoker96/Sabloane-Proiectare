package SPlab;

import java.util.ArrayList;

public class Section implements Element {
	String title;
	ArrayList<Element> elements=new ArrayList<Element>();
	Section(String title){
		this.title=title;
	}
	
	public void add(Element elem) {
		elements.add(elem);
	}
	public void remove(Element elem) {
		elements.remove(elem);
	}
	public int getChild(Element elem) {
		return elements.indexOf(elem);
	}
	public void accept(Visitor v) {
		for(int e=0;e<elements.size();e++)
		{
			elements.get(e).accept(v);;
		}
	}
	public void print() {
		System.out.println("--SectionTitle--");
		System.out.println(title);
		System.out.println("--Elements--");
		for(int e=0;e<elements.size();e++)
		{
			elements.get(e).print();
		}
	}

}
