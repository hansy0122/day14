package day14.CollectionFramework;

import java.util.*;

public class HashSetExample {
	public static void main(String ar[]) {
		Set<String> set = new HashSet<>();

		set.add("java");
		set.add("ja");
		set.add("va");
		set.add("aaa");
		set.add("bbb");
		set.add("java"); // java�� �ѹ��� �����

		int size = set.size();
		System.out.println("size =" + size);

		// Iterator Ȱ���Ͽ� ����ϱ�
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println();

		// ���� for�� ����ϱ�
		for (String str : set) {
			System.out.println(str);
		}
		System.out.println();

		set.remove("java");
		set.remove("aaa");
		
		//iterator = set.iterator(); �� ���� �����������. set�� ����Ǿ��� ������
		/*while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println();*/
		
		
		iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println();

	}
}
