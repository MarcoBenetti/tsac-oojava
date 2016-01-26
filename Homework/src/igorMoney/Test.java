package igorMoney;

/*import java.io.InputStreamReader;
import java.io.BufferedReader ;
import java.io.IOException;*/

public class Test {

	public static void main(String[] args) {
		MoneyChange[] m = MoneyChangeAlgorythm.change(1388);
		for (int i = 0; i < m.length; i++) {
			System.out.println(m[i]);
		}
	}

}

