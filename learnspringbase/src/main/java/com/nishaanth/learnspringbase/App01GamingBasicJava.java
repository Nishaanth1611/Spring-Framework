package com.nishaanth.learnspringbase;
import com.nishaanth.learnspringbase.game.GameRunner;
import com.nishaanth.learnspringbase.game.MarioGame;
import com.nishaanth.learnspringbase.game.PacmanGame;
import com.nishaanth.learnspringbase.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		var game = new PacmanGame();
		//var game = new SuperContraGame();
		//var game = new MarioGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();
	}

}
