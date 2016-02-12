package lists;

import java.util.HashSet;
import java.util.Set;



public class MySet {

	public static void main(String[] args) {
		
		Set<String> sets = new HashSet<>();
		
		sets.add("Persano");
		sets.add("Menis");
		
		//PER CONTAINS SU SET SERVE IMPLEMENTARE hashCode()
		
		//Per i tree set dobbiamo rendere le classi comparabili
		//---- WARNING! INTERFACE NEEDED! ----
		//Nostraclasse implements Comparable<Nostraclasse>
		//dopo di che implemento il metodo compare()
		

	}

}
