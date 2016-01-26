package igorMoney;

public abstract class MoneyChangeAlgorythm {
	private static Money[] money = new Money[]{new Money("Banconot", 500), new Money("Banconot", 200), new Money("Banconot", 100), new Money("Banconot", 50), new Money("Banconot", 20), new Money("Banconot", 10), new Money("Banconot", 5), new Money("Monet", 2), new Money("Monet", 1)};
	//money non è un array di int ma di money <- new class.
	
	public static MoneyChange[] change(int val){
		MoneyChange[] m = new MoneyChange[money.length];
		for(int i = 0; i < m.length; i++){
			m[i] = new MoneyChange(money[i], val / money[i].getValue());
			val = val % money[i].getValue();
		}
		return MoneyChange.ReduceVector(m);
	}
}