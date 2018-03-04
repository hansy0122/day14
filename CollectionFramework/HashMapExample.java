package day14.CollectionFramework;
import java.util.*;

public class HashMapExample {
	public static void main(String ar[]){
		Map<String, Integer> map=new HashMap<>();
		
		//객체 저장
		map.put("AAA", 10);
		map.put("BBB", 20);
		map.put("CCC", 30);
		map.put("DDD", 40);
		map.put("EEE", 50);
		map.put("FFF", 60);
		System.out.println("총 Entry 수: "+map.size());
		System.out.println();
		
		
		//객체 찾기 키값으로 검색
		System.out.println(map.get("AAA"));
		System.out.println(map.get("CCC"));
		System.out.println(map.get(""));
		System.out.println();
		
		//객체를 하나씩 처리
		Set<String> keySet =map.keySet();
		Iterator<String> iterator=keySet.iterator();
		while(iterator.hasNext()){
			String key=iterator.next();
			System.out.println("key="+key);
			System.out.println("value="+map.get(key));
		}
		System.out.println();
		
		//객체 삭제
		map.remove("AAA");
		System.out.println("총 Entry 수: "+map.size());
		
		//객체 하나씩 처리
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
		
		//객체 전체삭제
		map.clear();
		System.out.println("총 Entry 수: "+map.size());
	}
}
