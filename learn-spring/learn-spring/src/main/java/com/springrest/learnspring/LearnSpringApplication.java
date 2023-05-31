package com.springrest.learnspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springrest.learnspring.game.GameRunner;
import com.springrest.learnspring.game.MarioGame;

@SpringBootApplication
public class LearnSpringApplication {

	public static void main(String[] args) {
		//SpringApplication.run(LearnSpringApplication.class, args);
		MarioGame game = new MarioGame();
		GameRunner runner = new GameRunner(game);
		runner.run();
	
	}

}
