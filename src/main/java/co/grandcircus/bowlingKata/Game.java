package co.grandcircus.bowlingKata;

public class Game {

	private int score;

	public void roll(int pins) {
		score += pins;
	}

	public Integer score() {	
		return score;
	}

}
