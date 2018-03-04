package day14.CollectionFramework;

import java.util.*;

public class ComparatorExample {
	public static void main(String ar[]){
		TreeSet<Cat> treeSet=new TreeSet<>(new DescendingComparator());
		treeSet.add(new Cat("A",1));
		treeSet.add(new Cat("B",3));
		treeSet.add(new Cat("C",2));
		treeSet.add(new Cat("D",4));
		treeSet.add(new Cat("E",5));
		
		Iterator<Cat> iterator=treeSet.iterator();
		while(iterator.hasNext()){
			Cat cat=iterator.next();
			System.out.println("name="+cat.name+"   price="+cat.price);
		}

		
	}
}

class DescendingComparator implements Comparator<Cat>{

	@Override
	public int compare(Cat o1, Cat o2) {
		// TODO Auto-generated method stub
		if(o1.price<o2.price) return 1; //가격이 적은경우 뒤에오게함
		else if(o1.price>o2.price) return -1;
		else return 0;
	}
	
}

class Cat{
	public String name;
	public int price;
	
	public Cat(String name, int p){
		this.name=name;
		this.price=p;
	}
}
