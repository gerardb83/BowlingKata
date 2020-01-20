package co.grandcircus.bowlingKata;

public class Game {

	private int rolls[] = new int [21];
	private int currentRoll = 0;

	
	public void roll(int pins) {
		rolls[currentRoll++] = pins;
	}


	public Integer score() {	
		int score = 0;
		int i = 0;
		for(int frame = 0; frame < 10; frame++) {
			if (rolls[i] == 10) {
				score += 10 + strikeBonus(i);
				i++;
			} else if (rolls[i] + rolls[i +1] == 10) {
				score += 10 + spareBonus(i);
				i += 2;
			} else {
			
			score += rolls[i] + rolls[i + 1];
			i += 2;
			}
		}
		
		return score;
	}


	private int strikeBonus(int i) {
		return rolls[i + 1] + rolls[i + 2];
	}


	private int spareBonus(int i) {
		return rolls[i + 2];
	}

}
