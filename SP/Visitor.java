package SPlab;

public interface Visitor {
	public void visit(Image i);
	public void visit(ImageProxy imgProxy);
	public void visit(Table t);
	public void visit(Text text);
}
