package day14.CollectionFramework;
import java.util.*;
public class TreeSetExample3 {
	public static void main(String ar[]){
		TreeSet<String> treeSet =new TreeSet<>();
		treeSet.add("apple");
		treeSet.add("bag");
		treeSet.add("can");
		treeSet.add("die");
		treeSet.add("elephant");
		treeSet.add("free");
		treeSet.add("fire");
		treeSet.add("genurous");
		treeSet.add("high");
		treeSet.add("infant");
		treeSet.add("jealous");
		
		
		NavigableSet<String> nSet=treeSet.subSet("c",true,"g",true);
		for(String str:nSet){
			System.out.println(str);
		}
	}
}
