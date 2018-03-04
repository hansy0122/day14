package day14.CollectionFramework;
import java.util.*;

public class ComparableExample {
	public static void main(String ar[]){
		
		TreeSet<Person> treeSet=new TreeSet<>();
		treeSet.add(new Person("a",1));
		treeSet.add(new Person("b",2));
		treeSet.add(new Person("d",4));
		treeSet.add(new Person("c",3));
		treeSet.add(new Person("e",30));
		// treeSet.add(new Person("f",30)); 이미 treeSet.add(new Person("e",30))했기에 덮어써지지 않음.
		
		System.out.println(treeSet.size());
		
		Iterator<Person> iterator =treeSet.iterator();
		while(iterator.hasNext()){
			Person p=iterator.next();
			System.out.println("name="+p.name+" age="+p.age);
		}
		
	}
}

class Person implements Comparable<Person>{

	public String name;
	public int age;
	
	Person(String n,int a){
		this.name=n;
		this.age=a;
	}
	
	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		if(age<o.age){
			return -1;
		}else if(age==o.age){
			return 0;
		}
		else return 1;
	}
	
}
