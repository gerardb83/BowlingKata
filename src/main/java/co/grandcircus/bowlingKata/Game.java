package co.grandcircus.bowlingKata;

public class Game {

	private int rolls[] = new int[21];
	private int currentRoll = 0;

	public void roll(int pins) {
		rolls[currentRoll++] = pins;
	}

	public Integer score() {
		int score = 0;
		int frameIndex = 0;
		for (int frame = 0; frame < 10; frame++) {
			if (rolls[frameIndex] == 10) {
				score += 10 + strikeBonus(frameIndex);
				frameIndex++;
			} else if (sumOfBallsInFrame(frameIndex) == 10) {
				score += 10 + spareBonus(frameIndex);
				frameIndex += 2;
			} else {
				score += sumOfBallsInFrame(frameIndex);
				frameIndex += 2;
			}
		}

		return score;
	}

	private int sumOfBallsInFrame(int frameIndex) {
		return rolls[frameIndex] + rolls[frameIndex + 1];
	}

	private int strikeBonus(int i) {
		return rolls[i + 1] + rolls[i + 2];
	}

	private int spareBonus(int i) {
		return rolls[i + 2];
	}

}
