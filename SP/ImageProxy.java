package SPlab;

public class ImageProxy implements Element {
	Image realImage;
	String imgName;
	
	ImageProxy(String imgName){
		this.imgName=imgName;
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
	      if(realImage == null){
	         realImage = new 	Image(imgName);
	      }
	      realImage.print();
	   }
}
