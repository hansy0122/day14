package day14.CollectionFramework;
import java.util.*;

public class HashMapExample2 {
	public static void main(String ar[]){
		Map<Bear,Integer> map=new HashMap<>();
		Bear b=new Bear(1,"Jame");
		Bear b1=new Bear(1,"Jame");
		map.put(b, 123);
		map.put(b1, 253);
		map.put(new Bear(1,"Jame"), 333);
		System.out.println(map.size());
		System.out.println(map.get(b1));
		System.out.println(map.get(b));
		map.put(new Bear(1,"Jame"), 123);
		map.put(new Bear(1,"Jame"), 253);
		System.out.println(map.size());
		
		//map은 위에서 보다시피 put이건 get 이건 모두다 equals()와  hashCode()를 가지고 
		//메소드들을 실행한다 --> 특히 같은 key값인지 조사해야할때!!
		//같은 key 값으로 다른 value를 중복해서 저장하면 제일 뒤의값으로 대체된다.
	}
}

class Bear {
	public int sno;
	public String name;

	public Bear(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	// 인식번호와 이름이 같으면 true를 리턴
	public boolean equals(Object obj) {
		if (obj instanceof Bear) {
			Bear bear = (Bear) obj;
			return (this.sno == bear.sno && this.name.equals(bear.name));
		} else {
			return false;
		}
	}
	//학번과 이름이 같다면 동일한 값을 리턴 
	public int hashCode(){
		return (sno+name.hashCode());
	}
	
	
}