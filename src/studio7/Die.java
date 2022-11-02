package studio7;

public class Die {
	public int dice;
	public int n;
	
	public int getDice() {
		return dice; 
	}
	public void rollDice() {
		dice = (int) Math.random() * n + 1;
	}

}
