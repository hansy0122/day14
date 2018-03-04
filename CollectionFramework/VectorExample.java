package day14.CollectionFramework;
import java.util.*;

public class VectorExample {
	
public static void main(String ar[]){
	List<Board> list =new Vector<>();
	list.add(new Board("AAA","aaa"));
	list.add(new Board("BBB","bbb"));
	list.add(new Board("CCC","ccc"));
	list.add(new Board("DDD","ddd"));
	list.add(new Board("EEE","eee"));
	
	for(Board b : list){
		System.out.println(b.getName()+"    "+b.getContent());
	}
	System.out.println();
	list.remove(2);
	list.remove(2);
	
	for(Board b : list){
		System.out.println(b.getName()+"    "+b.getContent());
	}
	
}
}

class Board {
	private String name;
	private String content;
	
	Board(String n, String c){
		this.name=n;
		this.content=c;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
}
