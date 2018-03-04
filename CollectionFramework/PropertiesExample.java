package day14.CollectionFramework;
import java.io.FileReader;
import java.net.URLDecoder;
import java.util.*;
//이 예제를 위해서 database.properties를 먼저 작성해야함.
public class PropertiesExample {
	public static void main(String ar[]) throws Exception{
		Properties properties =new Properties();
		//주어진 파일의 상대경로를 URL객체로 리턴한후 파일의 절대경로를 리턴
		String path=PropertiesExample.class.getResource("database.properties").getPath(); 
		//경로에 한글이있을 경우 경로복원
		path=URLDecoder.decode(path,"utf-8");
		properties.load(new FileReader(path));
		
		String driver=properties.getProperty("driver");
		String url=properties.getProperty("url");
		String username=properties.getProperty("username");
		String password=properties.getProperty("password");
		
		System.out.println("driver="+driver);
		System.out.println("url="+url);
		System.out.println("username="+username);
		System.out.println("password="+password);
	}
}
