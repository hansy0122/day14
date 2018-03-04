package day14.CollectionFramework;
import java.util.*;
public class StackExample {
	public static void main(String ar[]){
		Stack<Coin> coinBox=new Stack<Coin>();
		
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(200));
		coinBox.push(new Coin(10));
		coinBox.push(new Coin(40));
		
		while(!coinBox.isEmpty()){
			Coin coin=coinBox.pop();
			System.out.println("pop coin's value="+coin.getValue());
		}
	}
}


class Coin{
	private int value;
	public Coin(int v){
		this.value=v;
	}
	public int getValue(){
		return value;
	}
	
}
