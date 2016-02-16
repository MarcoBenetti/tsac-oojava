package main;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		TemperatureSensor ts = new TemperatureSensor();
		
		final ArrayList<Double> listResults = new ArrayList<Double>();
		final Map<Integer, Integer> mapErrori = new HashMap<>();
		
		ts.setListener(new TemperatureSensorListener() {
			
			@Override
			public void onSuccess(double temperature) {
				listResults.add(temperature);
			}
			
			@Override
			public void onFailed(TemperatureSensorException exception) {
				if(mapErrori.containsKey(exception.getErrorcode())){
					Integer itemp = mapErrori.get(exception.getErrorcode());
					Integer iTemp2 = (itemp.intValue() + 1);
					mapErrori.put(exception.getErrorcode(), iTemp2);
				}else
					mapErrori.put(exception.getErrorcode(), 1);
			}
		});
		int i = 0;
		while(i < 1000){
			ts.next();
			i++;
		}
		
		Iterator iList = listResults.iterator();
		
		double somma = 0;
		double max = 0;
		int ti = 0;
		while(iList.hasNext()){
			double tempVal = ((Double) iList.next()).doubleValue();
			if(tempVal > max)
				max = tempVal;
			somma += tempVal;
		}
		
		double avg = somma / listResults.size();
		long avgRound = Math.round(avg);
		System.out.println("Temperatura massima: " + max);
		System.out.println("Temperatura media: " + avg);
		System.out.println("Temperatura media arrotondata: " + avgRound);
		System.out.println("Ripetizioni error code -2: " + mapErrori.get(-2));
		System.out.println("Ripetizioni error code -4: " + mapErrori.get(-4));
		
	}

}
