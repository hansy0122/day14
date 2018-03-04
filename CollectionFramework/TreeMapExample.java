package day14.CollectionFramework;
 import java.util.*;
 
public class TreeMapExample {
	public static void main(String ar[]){
		TreeMap<Integer,String> scores=new TreeMap<>();
		scores.put(11, "AAA");
		scores.put(22, "BBB");
		scores.put(33, "CCC");
		scores.put(44, "DDD");
		scores.put(55, "EEE");
		scores.put(66, "FFF");
		scores.put(77, "GGG");
		
		
		Map.Entry<Integer, String> entry=null;
		entry=scores.firstEntry();
		System.out.println(entry.getKey()+"\t"+entry.getValue());
		entry=scores.lastEntry();
		System.out.println(entry.getKey()+"\t"+entry.getValue());
		entry=scores.lowerEntry(44);
		System.out.println(entry.getKey()+"\t"+entry.getValue());
		entry=scores.higherEntry(44);
		System.out.println(entry.getKey()+"\t"+entry.getValue());
		entry=scores.ceilingEntry(44);
		System.out.println(entry.getKey()+"\t"+entry.getValue());
		entry=scores.floorEntry(44);
		System.out.println(entry.getKey()+"\t"+entry.getValue());
		
		while(!scores.isEmpty()){
			entry=scores.pollFirstEntry();
			System.out.println(entry.getKey()+"\t"+entry.getValue()+"\t"+scores.size());
		}
		
		
	}
}
