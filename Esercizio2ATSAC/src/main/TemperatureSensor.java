package main;

import java.util.Random;

/**
* NON MODIFICARE
*/
public class TemperatureSensor {
	
	private Random rand = new Random(126);
	private Random randErrorCode = new Random(12);
	
	private TemperatureSensorListener listener;
	
	/**
	 * Imposta callback
	 * @param listener callback richiamata dal metodo next()
	 */
	public void setListener(TemperatureSensorListener listener) {
		this.listener = listener; 
	}
	
	/**
	 * Ad ogni chiamata viene invocata la callback impostata
	 * su setListener.
	 * In caso di lettura corretta viene fornito il valore
	 * nella callback onSuccess.
	 * In caso di errore viene fornita sulla callback onFailed
	 * l'exception, con relativo codice di errore.
	 */
	public void next() {
		if (listener == null)
			return;
		
		// successo/errore simulato.
		double val = rand.nextDouble() * 30.0 - 1.0;  
		if (val > 0) {
			listener.onSuccess(val);
		} else {
			listener.onFailed(new TemperatureSensorException("Temperature Error", randErrorCode.nextInt(5)*-1));
		}
			
	}

}
