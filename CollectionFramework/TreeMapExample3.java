package day14.CollectionFramework;
import java.util.*;

public class TreeMapExample3 {
	public static void main(String ar[]){
		TreeMap<String,Integer> dict =new TreeMap<>();
		dict.put("apple", 10);
		dict.put("bed", 20);
		dict.put("cow", 30);
		dict.put("dance", 40);
		dict.put("easy", 50);
		dict.put("foot", 20);
		dict.put("gaint", 30);
		dict.put("haste", 10);
		dict.put("iphone", 40);
		dict.put("jacket", 50);
		
		NavigableMap<String,Integer> ndict= dict.subMap("c", false, "h", true);
		for(Map.Entry<String, Integer> m: ndict.entrySet()){
			System.out.println(m.getKey()+"         "+ m.getValue());
		}
	}
}
