package main;

/**
* NON MODIFICARE
*/
public class TemperatureSensorException extends Exception {

	private static final long serialVersionUID = 1L;
	
	private int errorcode;
	
	public TemperatureSensorException(String message, int errorcode) {
		super(message);
		this.errorcode = errorcode;
	}

	public int getErrorcode() {
		return errorcode;
	}

	public void setErrorcode(int errorcode) {
		this.errorcode = errorcode;
	}


}
