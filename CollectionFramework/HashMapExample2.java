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
		
		//map�� ������ ���ٽ��� put�̰� get �̰� ��δ� equals()��  hashCode()�� ������ 
		//�޼ҵ���� �����Ѵ� --> Ư�� ���� key������ �����ؾ��Ҷ�!!
		//���� key ������ �ٸ� value�� �ߺ��ؼ� �����ϸ� ���� ���ǰ����� ��ü�ȴ�.
	}
}

class Bear {
	public int sno;
	public String name;

	public Bear(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	// �νĹ�ȣ�� �̸��� ������ true�� ����
	public boolean equals(Object obj) {
		if (obj instanceof Bear) {
			Bear bear = (Bear) obj;
			return (this.sno == bear.sno && this.name.equals(bear.name));
		} else {
			return false;
		}
	}
	//�й��� �̸��� ���ٸ� ������ ���� ���� 
	public int hashCode(){
		return (sno+name.hashCode());
	}
	
	
}