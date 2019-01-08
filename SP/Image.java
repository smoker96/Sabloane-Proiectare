package SPlab;

import java.util.concurrent.TimeUnit;

public class Image implements Element {
	String imgName;
	
	Image(String imgName){
		this.imgName=imgName;
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
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
		System.out.println("--ImageName--");
		System.out.println(imgName);
	}
}
