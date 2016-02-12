package ui;

public class Button {
	
	String name;
	
	private ButtonComunicationInterface buttoncom;

	public void setButtoncom(ButtonComunicationInterface callback) {
		this.buttoncom = callback;
	}

	public void show(){
		System.out.println(name);
	}
	
	public void pressed() {
		buttoncom.onButtonPressed();
		
		//button informa chi è interessato che l'utente lo ha selezionato
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
