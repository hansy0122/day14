package day14.CollectionFramework;
	import java.util.*;
	
public class TreeSetExample2 {
	public static void main(String ar[]){
		TreeSet<Integer> tree =new TreeSet<>();
		for(int i=1;i<=10;i++){
		tree.add(i);
		}
		
		Iterator<Integer> iter1=tree.iterator();
		while(iter1.hasNext()){
			System.out.print(iter1.next()+" ");
		}
		System.out.println();
		
		Iterator<Integer> iter2=tree.descendingIterator();
		while(iter2.hasNext()){
			System.out.print(iter2.next()+" ");
		}
		System.out.println();
		NavigableSet<Integer> descendingSet = tree.descendingSet();
		for(Integer i:descendingSet){
			System.out.print(i+" ");
		}
		System.out.println();
		NavigableSet<Integer> descendingSet1 = tree.descendingSet().descendingSet();
		for(Integer i:descendingSet1){
			System.out.print(i+" ");
		}
	}
}
