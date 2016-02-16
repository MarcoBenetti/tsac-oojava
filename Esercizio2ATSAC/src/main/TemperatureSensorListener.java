package main;

/**
* NON MODIFICARE
*/
public interface TemperatureSensorListener {

	/**
	 * Metodo chiamato in caso di lettura corretta.
	 * @param temperature
	 */
	void onSuccess(double temperature);
	
	/**
	 * Metodo chiamato in caso di errore nella lettura.
	 * @param exception
	 */
	void onFailed(TemperatureSensorException exception);
	
}
