package SPlab;

import java.util.ArrayList;

public class Book {
	String title;
	ArrayList<Author> authors=new ArrayList<Author>();
	ArrayList<Element> elements=new ArrayList<Element>();
	
	Book(String title){
		this.title=title;
	}
	
	public void addAuthor(Author a) {
		authors.add(a);
	}
	public void add(Element e) {
		elements.add(e);
	}
	public void print(){
		System.out.println("---Title--- ");
		System.out.println(title);
		
		System.out.println("---Authors---");
		for(int auth=0;auth<authors.size();auth++) {
			System.out.println(authors.get(auth).name);
		}
		System.out.println("---Elements---");
		for(int elem=0;elem<elements.size();elem++) {
			System.out.println(elements.get(elem));
		}
	}

	public void addContent(Element e) {
		elements.add(e);
		
	}

}
