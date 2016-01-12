package MoneyCounter;
public class MoneyCounter {	
	public static void countMoney(int money){  //doveva essere un vettore
		System.out.println("Banconote da 500: " + money / 500);
		money = money%500;
		System.out.println("Banconote da 200: " + money / 200);
		money = money%200;
		System.out.println("Banconote da 100: " + money / 100);
		money = money%100;
		System.out.println("Banconote da 50: " + money / 50);
		money = money%50;
		System.out.println("Banconote da 20: " + money / 20);
		money = money%20;
		System.out.println("Banconote da 10: " + money / 10);
		money = money%10;
		System.out.println("Banconote da 5: " + money / 5);
		money = money%5;
		System.out.println("Monete da 2: " + money / 2);
		money = money%2;
		System.out.println("Monete da 1: " + money);
		
	}
}
