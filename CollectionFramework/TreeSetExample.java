package day14.CollectionFramework;
import java.util.*;

public class TreeSetExample {
	public static void main(String ar[]){
		
		TreeSet<Integer> scores =new TreeSet<>();
		for(int i=0;i<10;i++){
			scores.add(i); 		}
		
		for(Integer s:scores){
			System.out.println(s);
		}
		System.out.println();
		System.out.println(scores.first());
		System.out.println();
		System.out.println(scores.last());
		System.out.println();
		System.out.println(scores.lower(5));
		System.out.println();
		System.out.println(scores.higher(5));
		System.out.println();
		System.out.println(scores.floor(3));
		System.out.println();
		System.out.println(scores.ceiling(7));
		System.out.println();
		while(!scores.isEmpty()){
			System.out.println(scores.pollFirst());
			System.out.println(scores.size());
			System.out.println();
		}
		
	}
}
