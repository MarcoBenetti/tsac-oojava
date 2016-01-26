package igorMoney;

public class Money {
	private int value;
	private String type;
	
	public Money(String type, int value) {
		this.value = value;
		this.type = type;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}	
	
}
