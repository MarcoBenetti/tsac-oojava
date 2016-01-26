package igorMoney;

public class MoneyChange {
	Money m;
	int items;
	
	public MoneyChange(Money m, int items) {
		this.m = m;
		this.items = items;
	}
	
	public static MoneyChange[] ReduceVector(MoneyChange[] v){
		int counter = 0;
		for(int i = 0; i < v.length; i++){
			if(v[i].getItems() > 0)
				counter ++;
		}
		
		MoneyChange[] ret = new MoneyChange[counter];
		int j = 0;
		for(int i = 0; i < v.length; i++){
			if(v[i].getItems() > 0)
				ret[j] = v[i];
				j ++;
		}
		
		return ret;
	}

	public Money getM() {
		return m;
	}

	public void setM(Money m) {
		this.m = m;
	}

	public int getItems() {
		return items;
	}

	public void setItems(int items) {
		this.items = items;
	}

	@Override
	public String toString() {
		String tipo = "";
		if(this.items == 1)
			tipo = this.getM().getType() + "a";
		else
			tipo = this.getM().getType() + "e";
		return this.items + " " + tipo + " da " + this.getM().getValue();
	}
	
	
}
