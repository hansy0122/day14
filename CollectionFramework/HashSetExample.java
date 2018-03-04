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
		set.add("java"); // java는 한번만 저장됨

		int size = set.size();
		System.out.println("size =" + size);

		// Iterator 활용하여 출력하기
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println();

		// 향상된 for로 출력하기
		for (String str : set) {
			System.out.println(str);
		}
		System.out.println();

		set.remove("java");
		set.remove("aaa");
		
		//iterator = set.iterator(); 를 새로 설정해줘야함. set이 변경되었기 때문에
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
