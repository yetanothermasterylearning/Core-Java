package com.yaml.main;

import com.yaml.model.Board;
import com.yaml.model.Dice;
import com.yaml.model.Ladder;
import com.yaml.model.Player;
import com.yaml.model.Snake;

public class Main {

	public static void main(String[] args) {
		Board board = new Board();
		Dice dice = new Dice();
		int maximumObstacle = 3;
		Snake[] snakes = generateSnakes(maximumObstacle);
		Ladder[] ladders = generateLadders(maximumObstacle);
		
		int numberOfPlayers = 2;
		Player[] players = generatePlayers(numberOfPlayers);
		
		boolean isGameCompleted = false;
		/* play:
		 * player-1 roll the dice
		 * 	move player position to a new position => current position + dice value
		 *   end condition => maximum 
		 *  check Obstacle conditions =? new position == snake.startingPosition
		 *  	-> snake  -> new position == snake.startingPosition  
		 *  		: move user position to end position of snake
		 *  	-> ladder -> new position == ladder.startingPosition
		 *  		: move user position to end position of ladder
		 * move player-1 to end of array
		*/
		while(isGameCompleted) {
			
		}
		
	}
	
	private static Player[] generatePlayers(int numberOfPlayers) {
		Player[] players = new Player[numberOfPlayers];
		players[0] = new Player("Player1");
		players[1] = new Player("Player2");
		return players;
	}

	private static Snake[] generateSnakes(int maximumObstacle) {
		Snake[] snakes = new Snake[maximumObstacle];
		snakes[0] = new Snake(30, 4);
		snakes[1] = new Snake(60, 30);
		snakes[2] = new Snake(95, 13);
		return snakes;
	}
	
	private static Ladder[] generateLadders(int maximumObstacle) {
		Ladder[] ladders = new Ladder[maximumObstacle];
		ladders[0] = new Ladder(10, 35);
		ladders[1] = new Ladder(40, 72);
		ladders[2] = new Ladder(60, 92);
		return ladders;
	}

}
