package lists;

import java.util.ArrayList;
import java.util.List;

class Persano{
	String barese;
	String ebreo;
}

public class MyLists {
	
	public static void main(String[] args){
		
		{
		
			ArrayList aobject = new ArrayList(); //Contiene oggetti Object
			
			aobject.add("Pippo");
			aobject.add(new Persano());
			
			int x = 5;
			Integer ix = x; //boxing, metto un primitivo in una classe
			
			int y = ix;     //unboxing: potrebbe esplodere
			//perchè un oggetto può essere NULL, un primitivo no
			
			aobject.add(ix);//si fa grazie al boxing
			
			Object o1 = aobject.get(1); //obbligo di casting
			if(o1 instanceof Persano) {
				Persano p1 = (Persano)o1;
			}
			
			
			ArrayList<String> astring = new ArrayList<String>();
			astring.add("Pippo");
			//astring.add(new Persano()); NON VA
			astring.add("Prova");
			
			String s = astring.get(1);
			
			List<Persano> apersano = new ArrayList<>(); //non serve dire il tipo dopo
			//inizializzo con list e dichiaro in corsa il tipo di lista che voglio
			//che sia arraylist, linkedlist etc...
		
		}
		{
			List<String> ls = new ArrayList<>();
			ls.add("s1");
			ls.add("s2");
			ls.add("s3");
			ls.add("s4");
			
			System.out.println("Contiene s3? " + ls.contains("s3"));
			System.out.println("Contiene s5? " + ls.contains("s5"));
			
			//per tutto un pippone dobbiamo overraidare il metodo equals se creo un
			//oggetto io, altrimenti controlla i riferimenti, non i valori
		}
		
		{
			List<Integer> li = new ArrayList<>();
			li.add(5);
			li.add(6);
			li.add(3);
			li.add(30);
			
			int res = li.stream().
					map(x -> x * 2)
					.reduce((a, x) -> a + x).get();
			//lo stream abilita le operazioni funzionali
			//il get ritorna il valore NEL CASO NON SIA NULL
		}
	}
	
}
