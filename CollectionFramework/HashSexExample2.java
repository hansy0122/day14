package day14.CollectionFramework;

import java.util.*;

public class HashSexExample2 {
	public static void main(String ar[]) {

		Set<Owl> set = new HashSet();

		// �ν��Ͻ��� �ٸ����� �츮�� ������ ��Ģ�� ���� ���� �����Ͱ� �����ϹǷ� ��ü 1���� ����

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

	// name�� age�� ������ true�� ����
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

	// name�� age�� ������ ������ hashCode�� ����
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}

}