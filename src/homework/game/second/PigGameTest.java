package homework.game.second;


import java.util.*;



public class PigGameTest {
	Random random = new Random();
	
	int diceOccurance;
	
	public int rollTheDice() {
		return random.nextInt(7);
	}
	
	public static void main(String[] args) {
		PigGame piggame = new PigGame();
		
		piggame.gameLogic();
	}
}

