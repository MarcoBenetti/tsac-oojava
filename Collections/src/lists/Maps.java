package lists;

import java.util.HashMap;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {
		
		Map<String, Integer> ms = new HashMap<>();
		
		//inserisco chiave - valore
		ms.put("Luca", 5);
		ms.put("Marco", 3);
		ms.put("Persano", 2);
		
		//leggo
		int x = ms.get("Marco");
		System.out.println(x); // -> ritorna il valore agganciato a "Marco"
	}

}
