package co.grandcircus.bowlingKata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AppTest {
	
	private Game game;
	
	@BeforeEach
	public void setup() {
		game = new Game();
	}

	@Test
	public void whenYouRollAllMissesScoreReturnsZero(){
		rollMany(20, 0);
		assertEquals(0, game.score());
	}
	
	@Test
	public void whenYouRollAllOnesScoreReturns20(){
		rollMany(20, 1);
		assertEquals(20, game.score());
	}
	
//	@Test
//	public void whenYouRollASpareThenThreeThenAllMissesScoreReturns16(){
//		game.roll(5);
//		game.roll(5);
//		game.roll(3);
//		rollMany(17, 0);
//		assertEquals(16, game.score());
//	}
	
	public void rollMany(int n, int pins) {
		for (int i = 0; i < n; i++) {
			game.roll(pins);
		}
	}

}
