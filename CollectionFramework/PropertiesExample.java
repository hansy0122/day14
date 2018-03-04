package day14.CollectionFramework;
import java.io.FileReader;
import java.net.URLDecoder;
import java.util.*;
//�� ������ ���ؼ� database.properties�� ���� �ۼ��ؾ���.
public class PropertiesExample {
	public static void main(String ar[]) throws Exception{
		Properties properties =new Properties();
		//�־��� ������ ����θ� URL��ü�� �������� ������ �����θ� ����
		String path=PropertiesExample.class.getResource("database.properties").getPath(); 
		//��ο� �ѱ������� ��� ��κ���
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
