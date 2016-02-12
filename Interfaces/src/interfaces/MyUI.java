package interfaces;

import ui.Button;
import ui.ButtonComunicationInterface;

public class MyUI implements ButtonComunicationInterface {
	
	void run(){
		Button b = new Button();
		b.setName("Clisck me!");
		
		b.show();
		
		b.setButtoncom(this); //ehi bottone! quando ti premono chiama me
		
		b.pressed();
		
	}
	
	@Override
	public void onButtonPressed(){
		System.out.println("Grazie per avermi (s)premuto ;)");
	}
}
