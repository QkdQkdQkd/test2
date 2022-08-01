package chapter17.Stack_Queu;

import java.util.Stack;

public class CoinMain {

	public static void main(String[] args) {
		
		Stack<Coin> coinBox=new Stack<Coin>();
		
		coinBox.push(new Coin(200000)); // Coin co=new Coin(20000);
		coinBox.push(new Coin(5000000));
		coinBox.push(new Coin(100000));
		coinBox.push(new Coin(50000));
		coinBox.push(new Coin(30000));
		/*
		for(int i=100;i<501;i+=100) {
			Coin coin = new Coin(i);	
			coinBox.push(coin);
		}
		*/
		//System.out.println(!coinBox.empty());
		
		while(!coinBox.empty()) {
			Coin coin=coinBox.pop();
			System.out.println("²¨³»¿Â µ· : "+coin.getValue());
		}
		
	}

}
