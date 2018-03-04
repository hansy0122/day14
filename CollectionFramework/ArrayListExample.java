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
	
	//����� ��ü�� ���
	int size= list.size();
	System.out.println(size);
	System.out.println();
	
	//�ε��� �ѹ� 2�� ����� ��ü ���   ps. �ε�����  0���� ������.
	String s2=list.get(2);
	System.out.println(s2);
	System.out.println();
	
	for(int i=0;i<list.size();i++){
		System.out.println(list.get(i));
	}
	System.out.println();
	
	list.remove(2); //3333 �����
	list.remove(2); //CCC �����
	list.remove("AAA"); // ó�� ����� AAA ����
	
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
