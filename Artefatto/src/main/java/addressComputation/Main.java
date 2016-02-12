package addressComputation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.maps.*;
import com.google.maps.model.GeocodingResult;

interface MyPendingResult extends PendingResult.Callback<GeocodingResult[]>{
	public void setIndex(int index);

	public void setMap(Map<String, List<Integer>> map);
}

public class Main {
	
	class MyCallback implements PendingResult.Callback<GeocodingResult[]>
	{
		
		Map<String, List<Integer>> map = new HashMap<>();		
		 int index;
		
		
		
		public Map<String, List<Integer>> getMap() {
			return map;
		}

		public void setMap(Map<String, List<Integer>> map) {
			this.map = map;
		}

		public int getIndex() {
			return index;
		}

		public void setIndex(int index) {
			this.index = index;
		}

		public void onResult(GeocodingResult[] result) {
			//ArrayList<Integer> check = ms.get(result[0].formattedAddress);
			if(!map.containsKey(result[0].formattedAddress)){
				List<Integer> aTemp = new ArrayList<Integer>();
				aTemp.add(index);
				map.put(result[0].formattedAddress, aTemp);
			}else{
				List<Integer> list = map.get(result[0].formattedAddress);
				list.add(index);
			}
			
		}

    	public void onFailure(Throwable e) {
    		System.err.println(e);
		}
	}
	public void run() {
		//TODO remove key before pushing
				String key = "ti piacerebbe";
				//String key = args[0];
				
				// READ
				
				int from = 1;
				int to = 10;
				
				GeoApiContext context = new GeoApiContext().setApiKey(key);
				
				final Map<String, List<Integer>> ms = new HashMap<>();		
				
				try{
					FileReader fr = new FileReader("./Files/esercizi_vicinato_sede_fissa.csv");
					BufferedReader br = new BufferedReader(fr);
					
					br.readLine(); //skip first row
					
					final IntegerSmart i = new IntegerSmart(0);
					while(i.getN() < to){
						String row = br.readLine();
						if(i.getN() < from){
							i.setN(i.getN() + 1);
							continue;
						}
						
						String[] items = row.split(";");
						if((row.contains("VIA") || row.contains("PZA") || row.contains("PTA") || row.contains("VLE") || row.contains("CSO") || row.contains("PLE") || row.contains("ALZ") || row.contains("FOR") || row.contains("GLL") || row.contains("LGO")) && items.length >= 4){
							//verified as good address, handle it
							GeocodingApiRequest req = GeocodingApi.newRequest(context).address(items[2] + items[3] + items[4] + " Milano");
							
//							MyPendingResult mycallback = new MyPendingResult() {
//								
//								Map<String, List<Integer>> map = new HashMap<>();		
//								 int index;
//								
//								
//								
//								public Map<String, List<Integer>> getMap() {
//									return map;
//								}
//
//								public void setMap(Map<String, List<Integer>> map) {
//									this.map = map;
//								}
//
//								public int getIndex() {
//									return index;
//								}
//
//								public void setIndex(int index) {
//									this.index = index;
//								}
//
//								public void onResult(GeocodingResult[] result) {
//									//ArrayList<Integer> check = ms.get(result[0].formattedAddress);
//									if(!map.containsKey(result[0].formattedAddress)){
//										List<Integer> aTemp = new ArrayList<Integer>();
//										aTemp.add(index);
//										map.put(result[0].formattedAddress, aTemp);
//									}else{
//										List<Integer> list = map.get(result[0].formattedAddress);
//										list.add(index);
//									}
//									
//								}
//
//						    	public void onFailure(Throwable e) {
//						    		System.err.println(e);
//								}
//							};
//							mycallback.setMap(ms);
//							mycallback.setIndex(i.getN());						
//							req.setCallback(mycallback);
							
							final int index = i.getN();
							req.setCallback(new PendingResult.Callback<GeocodingResult[]>() {
								public void onResult(GeocodingResult[] result) {
									//ArrayList<Integer> check = ms.get(result[0].formattedAddress);
									if(!ms.containsKey(result[0].formattedAddress)){
										List<Integer> aTemp = new ArrayList<Integer>();
										aTemp.add(index);
										ms.put(result[0].formattedAddress, aTemp);
									}else{
										List<Integer> list = ms.get(result[0].formattedAddress);
										list.add(index);
									}
									
								}
		
						    	public void onFailure(Throwable e) {
						    		System.err.println(e);
								}
							});
							
							
						}
						i.setN(i.getN() + 1);
					}
					
				}catch (Exception e){
					System.err.println(e);
				}
				

				
//				// WRITE
//				
//				FileWriter fw = new FileWriter("nomefileout.csv");
//				PrintWriter pw = new PrintWriter(fw);
//				
//				// while ho dati da scrivere...
//				pw.println("ciao a tutti;...");
				
				
				
	}
	
	
	public static void main(String[] args) {
		
		Main main = new Main();
		main.run();
		
		
		
		
	}

}
