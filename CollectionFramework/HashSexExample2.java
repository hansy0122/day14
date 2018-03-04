package day14.CollectionFramework;

import java.util.*;

public class HashSexExample2 {
	public static void main(String ar[]) {

		Set<Owl> set = new HashSet();

		// 인스턴스는 다르지만 우리가 정의한 규칙에 따라 내부 데이터가 동일하므로 객체 1개만 저장

		set.add(new Owl("AAA", 10));
		set.add(new Owl("AAA", 10));
		System.out.println("Size=" + set.size());
		System.out.println();
		
		set.add(new Owl("BBB", 10));
		System.out.println("Size=" + set.size());

	}
}

class Owl {
	public String name;
	public int age;

	public Owl(String n, int a) {
		this.name = n;
		this.age = a;
	}

	// name과 age가 같으면 true를 리턴
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Owl) {
			Owl owl = (Owl) obj;
			boolean result = owl.name.equals(this.name) && owl.age == this.age;
			return result;
		} else {
			return false;
		}
	}

	// name과 age가 같으면 동일한 hashCode를 리턴
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}

}