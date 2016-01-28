package videoteca;

public class Cassetta extends Film{

	public int calcolaCosto(int giorni) {
		int tot = 100;
		int i = 1;
		while(giorni > 1 && i < giorni){
			tot += 200;
			i++;
		}
		return tot;
	}

}
