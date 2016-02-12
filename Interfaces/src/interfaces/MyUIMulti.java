package interfaces;

import ui.Button;
import ui.ButtonComunicationInterface;


public class MyUIMulti {
	
	class ButtonCommunicatorB1 implements ButtonComunicationInterface{ //classe innestata
		//accesso diretto alla classe in cui è contenuta
		private MyUIMulti parent;
		public ButtonCommunicatorB1(MyUIMulti parent) {
			this.parent = parent;
		}
		@Override
		public void onButtonPressed(){
			System.out.println("Grazie per avermi (s)premuto ;)" + message);
		}
	}

	class ButtonCommunicatorB2 implements ButtonComunicationInterface{ //classe innestata
		private MyUIMulti parent;
		public ButtonCommunicatorB2(MyUIMulti parent) {
			this.parent = parent;
		}
		@Override
		public void onButtonPressed(){
			System.out.println("Nope!" + message);
		}
	}
	
	private String message;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public MyUIMulti(){
		this.message = "Welcome";
	}
	
	void run(){
		Button b1 = new Button();
		b1.setName("Clisck me!");
		
		b1.show();
		
		b1.setButtoncom(new ButtonCommunicatorB1(this)); //ehi bottone! quando ti premono chiama il B!
		
		
		Button b2 = new Button();
		b2.setName("Non premermi!");
		
		b2.show();
		
		b2.setButtoncom(new ButtonCommunicatorB2(this)); //ehi bottone! quando ti premono chiama il B2
		
		//codice dell'ui
		//b1.pressed();
		b2.pressed();
		
		//chiamano lo stesso metodo!
		
	}
	
	
}