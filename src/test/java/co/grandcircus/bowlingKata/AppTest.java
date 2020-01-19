package co.grandcircus.bowlingKata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AppTest {

	@Test
	public void whenYouRollAllMissesScoreReturnsZero(){
		Game game = new Game();
		game.roll(0);
		assertEquals(0, game.score());
	}
	

}
