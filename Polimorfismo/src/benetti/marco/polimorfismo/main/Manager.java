package benetti.marco.polimorfismo.main;

public class Manager extends Dipendente{
	private int bonus;
	private Progetto[] progetti;
	
	public int calcoloStipendio() {
		
		int pb = getPagaBase();
		
		return Math.round(bonus + pb + pb * getAnzianita() * 2 / 100.0f);
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public Progetto[] getProgetti() {
		return progetti;
	}

	public void setProgetti(Progetto[] progetti) {
		this.progetti = progetti;
	}
}
