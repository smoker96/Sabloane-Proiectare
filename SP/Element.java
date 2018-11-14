package SPlab;

public interface Element {
	public void add(Element elem);
	public void remove(Element elem);
	public int getChild(Element elem);
	public void print();
	public void accept(Visitor v);
}
