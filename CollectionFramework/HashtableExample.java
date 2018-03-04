package day14.CollectionFramework;
import java.util.*;

public class HashtableExample {
public static void main(String ar[]){
	Map<String,String> map=new Hashtable<>();
	map.put("A","123");
	map.put("B", "1234");
	
	Scanner sc=new Scanner(System.in);
	while(true){
		System.out.println("enter id & password");
		System.out.println("id:");
		String id=sc.nextLine();
		System.out.println("password:");
		String password=sc.nextLine();
		System.out.println();
		
		if(map.containsKey(id)){
			if(map.get(id).equals(password)){
				System.out.println("로그인 성공");
				break;
			}else{
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
		}else{
			System.out.println("there is no id");
		}
	}
}
}
