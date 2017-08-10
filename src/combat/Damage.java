package global.entities.interactions.combat;

public class Damage {
	
	private int totalNumDmgId = 0;
	private int minDmg;
	private int maxDmg;
	
	public void defineTotalNumDmgId() {
		setTotalNumDmgId(maxDmg-minDmg+1);
	}
	
	private Damage(int minDmg, int maxDmg) {
		this.totalNumDmgId = 0;
		this.minDmg = minDmg;
		this.maxDmg = maxDmg;
	}
	
	public String showDamage() {
		return getMinDmg()+" - "+getMaxDmg();
	}
	
	public void checkDmgOutput() {
		
	}
	
	public void dealDamage(int bonusDmg) {
		
	}

	public int getTotalNumDmgId() {
		return totalNumDmgId;
	}

	public void setTotalNumDmgId(int totalNumDmgId) {
		this.totalNumDmgId = totalNumDmgId;
	}

	private int getMinDmg() {
		return minDmg;
	}

	private int getMaxDmg() {
		return maxDmg;
	}
	
	
	
}
