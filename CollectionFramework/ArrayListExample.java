package day14.CollectionFramework;

import java.util.*;

public class ArrayListExample {
public static void main(String ar[]){
	List<String> list= new ArrayList<>();
	list.add("AAA");
	list.add("BBB");
	list.add("CCC");
	list.add("DDD");
	list.add("AAA");
	list.add(2,"3333");
	
	//저장된 객체수 얻기
	int size= list.size();
	System.out.println(size);
	System.out.println();
	
	//인덱스 넘버 2에 저장된 객체 얻기   ps. 인덱스는  0부터 시작함.
	String s2=list.get(2);
	System.out.println(s2);
	System.out.println();
	
	for(int i=0;i<list.size();i++){
		System.out.println(list.get(i));
	}
	System.out.println();
	
	list.remove(2); //3333 사라짐
	list.remove(2); //CCC 사라짐
	list.remove("AAA"); // 처음 저장된 AAA 삭제
	
	for(int i=0;i<list.size();i++){
		System.out.println(list.get(i));
	}
	System.out.println();
	
	
	List<Character> list2=Arrays.asList('a','b','c');
	
	for(int i=0;i<list2.size();i++){
		System.out.println(list2.get(i));
	}
	System.out.println();
	
	for(char ch:list2){
		System.out.println(ch);
	}
	
	

}
}
