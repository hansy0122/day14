package day14.CollectionFramework;
import java.util.*;

public class HashMapExample {
	public static void main(String ar[]){
		Map<String, Integer> map=new HashMap<>();
		
		//��ü ����
		map.put("AAA", 10);
		map.put("BBB", 20);
		map.put("CCC", 30);
		map.put("DDD", 40);
		map.put("EEE", 50);
		map.put("FFF", 60);
		System.out.println("�� Entry ��: "+map.size());
		System.out.println();
		
		
		//��ü ã�� Ű������ �˻�
		System.out.println(map.get("AAA"));
		System.out.println(map.get("CCC"));
		System.out.println(map.get(""));
		System.out.println();
		
		//��ü�� �ϳ��� ó��
		Set<String> keySet =map.keySet();
		Iterator<String> iterator=keySet.iterator();
		while(iterator.hasNext()){
			String key=iterator.next();
			System.out.println("key="+key);
			System.out.println("value="+map.get(key));
		}
		System.out.println();
		
		//��ü ����
		map.remove("AAA");
		System.out.println("�� Entry ��: "+map.size());
		
		//��ü �ϳ��� ó��
		Set<Map.Entry<String, Integer>> entrySet= map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator =entrySet.iterator();
		while(entryIterator.hasNext()){
			Map.Entry<String, Integer> mapEntry=entryIterator.next();
			String key=mapEntry.getKey();
			Integer value=mapEntry.getValue();
			
			System.out.println("key="+key);
			System.out.println("value="+value);
		}
		System.out.println();
		
		//��ü ��ü����
		map.clear();
		System.out.println("�� Entry ��: "+map.size());
	}
}
