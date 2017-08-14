package global.entities.interactions.combat;

import java.util.Random;

public class Damage {
	
	private Random randNum = new Random(); 
	private int totalNumDmgId = 0;
	private int minDmg;
	private int maxDmg;
	private double baseDmgNumId;
	
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
	
	private void determineBaseDmgNumId(){
		
	}
	
	public void checkDmgOutput() {
		if(!isCritical) {
			double dmgOutNumId = randNum.nextDouble(1)+0.01;
			int maxNumDmgVal = totalNumDmgId;
			
			for(int i=1;baseDmgNumId*i <= 1;i++) {
				if(dmgOutNumId >= 1 - (baseDmgNumId*i)) {
					dealDamage(maxNumDmgVal);
					break;
				}else {
					maxNumDmgVal--;
				}
			}
		}
	}
	
	public static void dealDamage(int bonusDmg) {
		
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
