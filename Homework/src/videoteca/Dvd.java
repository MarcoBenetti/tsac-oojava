package videoteca;

public class Dvd extends Film{

	public int calcolaCosto(int giorni) {
		int tot = 0;
		for(int i = 0; i < giorni; i++){
			if(i < 2)
				tot += 150;
			else
				tot += 200;
		}
		return tot;
	}
}
