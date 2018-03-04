package day14.CollectionFramework;

import java.util.TreeMap;
import java.util.*;

public class TreeMapExample2 {
public static void main(String ar[]){
	TreeMap<Integer,String> scores=new TreeMap<>();
	scores.put(11, "AAA");
	scores.put(22, "BBB");
	scores.put(33, "CCC");
	scores.put(44, "DDD");
	scores.put(55, "EEE");
	scores.put(66, "FFF");
	scores.put(77, "GGG");
	
	NavigableMap<Integer,String> descendingMap =scores.descendingMap();
	Set<Map.Entry<Integer, String>> descendingEntrySet=descendingMap.entrySet();
	
	for(Map.Entry<Integer, String> entry: descendingEntrySet){
		System.out.println(entry.getKey()+"  "+ entry.getValue());
	}
	System.out.println();
	
	Set<Integer> descendingSet=scores.descendingKeySet();
	for(Integer i: descendingSet){
		System.out.println(i+"  "+scores.get(i));
	}
	System.out.println();
	
	NavigableMap<Integer,String> ascendingMap =scores.descendingMap().descendingMap();
	Set<Map.Entry<Integer, String>> ascendingEntrySet=ascendingMap.entrySet();
	
	for(Map.Entry<Integer, String> entry: ascendingEntrySet){
		System.out.println(entry.getKey()+"  "+ entry.getValue());
	}
	
	
}
}
