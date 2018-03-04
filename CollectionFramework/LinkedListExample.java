package day14.CollectionFramework;
import java.util.*;
public class LinkedListExample {
	public static void main(String ar[]){
		//LinkedList랑 Array 리스트 중간에 객체 추가 삭제 시간비교 
		List<String> list1= new ArrayList();
		List<String> list2 =new LinkedList();
		
		long startTime;
		long endTime;
		
		
		startTime=System.nanoTime();
		for(int i=0;i<10000;i++){
			list1.add(0, "1");
		}
		endTime=System.nanoTime();
		System.out.println("ArrayList time:"+(endTime-startTime)+"ns");
		
		startTime=System.nanoTime();
		for(int i=0;i<10000;i++){
			list2.add(0, "1");
		}
		endTime=System.nanoTime();
		System.out.println("LinkedList time:"+(endTime-startTime)+"ns");
	}
}
