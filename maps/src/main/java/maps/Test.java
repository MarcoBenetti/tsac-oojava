package maps;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import com.google.maps.GeoApiContext;
import com.google.maps.GeocodingApi;
import com.google.maps.GeocodingApiRequest;
import com.google.maps.PendingResult;
import com.google.maps.model.GeocodingResult;

interface myPendingResult extends PendingResult.Callback<GeocodingResult[]> {

	void setKey_value(Entry<String, ArrayList<String>> key_value);
	
}

public class Test {

	public static void main(String[] args) throws Exception {
		
		GeoApiContext context = new GeoApiContext().setApiKey("AIzaSyB_9UJQ3vtx649C2DqVy0g9VtzeVaxvf6Q");

		FileReader fr = new FileReader("Bed and Breakfast.csv");
		BufferedReader br = new BufferedReader(fr);

		String row = br.readLine();

		String[] rowToSplit;

		Map<String, ArrayList<String>> Mappina = new HashMap<>();

		while ((row = br.readLine()) != null) {
			rowToSplit = row.split(";");

			if (Mappina.containsKey(rowToSplit[8])) {
				Mappina.get(rowToSplit[8]).add(rowToSplit[5]);
			} else {
				ArrayList<String> denominazione = new ArrayList<>();
				denominazione.add(rowToSplit[5]);
				Mappina.put(rowToSplit[8], denominazione);
			}
		}

		Set<Entry<String, ArrayList<String>>> keySet = Mappina.entrySet();
		Iterator<Entry<String, ArrayList<String>>> i = keySet.iterator();

		FileWriter fw = new FileWriter("bb.csv");
		final PrintWriter pw = new PrintWriter(fw);

		pw.println("INDIRIZZO;LATITUDINE,LONGITUDINE;DENOMINAZIONE/I");

		Entry<String, ArrayList<String>> key_value;
		String indirizzo;

		ArrayList<String> denominazione;
		
		int j = 0;

		while (j++ < 10) {
			key_value = i.next();
			indirizzo = key_value.getKey();

			myPendingResult myCall = new myPendingResult() {
				
				private Entry<String, ArrayList<String>> key_value;
				
				@Override
				public void onResult(GeocodingResult[] arg0) {
					pw.println(key_value.getKey() + ";" + arg0[0].geometry.location + ";" + key_value.getValue().toString() + ";");
				}
				
				@Override
				public void onFailure(Throwable arg0) {
					pw.println(key_value.getKey() + ";" + "NULL;" + key_value.getValue().toString() + ";");
				}

				
				@Override
				public void setKey_value(Entry<String, ArrayList<String>> key_value) {
					this.key_value = key_value;
					
				}
			};
			
			GeocodingApiRequest req = GeocodingApi.newRequest(context).address(indirizzo);
			
			myCall.setKey_value(key_value);
			
			req.setCallback(myCall);
			
		}
		Thread.sleep(3000);
		pw.close();
	}
}