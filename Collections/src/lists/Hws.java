package lists;

import java.util.HashMap;
import java.util.Map;

import javax.xml.crypto.dsig.spec.HMACParameterSpec;

class Person{
	private String nome;
	private String cognome;
	
	Person(String n){
		this.nome = n;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	
}

public class Hws {

	public static void main(String[] args){
		Map<Person, Integer> hm = new HashMap<>();
		
		hm.put(new Person("Persano"), 1);
	}
	
	
}
