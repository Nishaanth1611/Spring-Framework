package com.nishaanth.learnspringbase;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nishaanth.learnspringbase.game.GameRunner;
import com.nishaanth.learnspringbase.game.GamingConsole;
import com.nishaanth.learnspringbase.game.MarioGame;
import com.nishaanth.learnspringbase.game.PacmanGame;
import com.nishaanth.learnspringbase.game.SuperContraGame;

public class App03GamingSpringBeans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try(
        		var context = new AnnotationConfigApplicationContext
        		(GamingConfiguration.class)){
        	
        	context.getBean(GamingConsole.class).up();	
        	
        	context.getBean(GameRunner.class).run();
        }
	}

}
