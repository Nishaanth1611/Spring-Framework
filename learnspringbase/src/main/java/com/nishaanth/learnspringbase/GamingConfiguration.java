package com.nishaanth.learnspringbase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.nishaanth.learnspringbase.game.GameRunner;
import com.nishaanth.learnspringbase.game.GamingConsole;
import com.nishaanth.learnspringbase.game.PacmanGame;

@Configuration

public class GamingConfiguration {

	@Bean
	public  GamingConsole game() {
	var game = new PacmanGame();
	return game;
	}
	
	@Bean
	public  GameRunner gameRunner(GamingConsole game) {
		var gameRunner = new GameRunner(game);
	return gameRunner;
	}
}