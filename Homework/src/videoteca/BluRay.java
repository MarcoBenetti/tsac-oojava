package videoteca;

public class BluRay extends Film{

	public int calcolaCosto(int giorni) {
		float tot = 100f;
		for(int i = 1; i < giorni; i++){
			tot += tot / 10f;
		}
		return Math.round(tot);
	}

}
