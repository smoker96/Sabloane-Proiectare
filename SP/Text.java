package SPlab;

public class Text implements Element {
	String text;
	
	Text(String text){
		this.text=text;
	}
	public void add(Element elem) {
	}
	public void remove(Element elem) {
	}
	public int getChild(Element elem) {
		return 0;
	}
	public void accept(Visitor v) {
		v.visit(this);
	}
	public void print() {
		System.out.println("--Paragraph--");
		System.out.println(text);
	}
}
