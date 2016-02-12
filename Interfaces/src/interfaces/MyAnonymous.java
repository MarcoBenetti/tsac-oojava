package interfaces;

import ui.Button;
import ui.ButtonComunicationInterface;


public class MyAnonymous {
	
	private String message;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public MyAnonymous(){
		this.message = "Welcome";
	}
	
	void run(){
		Button b1 = new Button();
		b1.setName("Clisck me!");
		
		b1.show();
		
		b1.setButtoncom(new ButtonComunicationInterface() {
			
			@Override
			public void onButtonPressed() {
				System.out.println("Grazie per avermi (s)premuto ;)" + message);
				
			}
		}); //CLASSE ANONIMA
		
		
		Button b2 = new Button();
		b2.setName("Non premermi!");
		
		b2.show();
		
		b2.setButtoncom(() -> System.out.println("Nope! But " + message)); //LAMBDAH
//funziona solo se l'interfacciaha un solo metodo, ahahah cazzoni quelli di giava
		
		//codice dell'ui
		//b1.pressed();
		b2.pressed();
		
		//chiamano lo stesso metodo!
		
	}
	
	
}