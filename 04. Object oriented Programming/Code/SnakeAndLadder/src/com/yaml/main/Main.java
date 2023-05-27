package com.yaml.main;

import com.yaml.model.Board;
import com.yaml.model.Dice;
import com.yaml.model.Ladder;
import com.yaml.model.Obstacle;
import com.yaml.model.Player;
import com.yaml.model.Snake;
import com.yaml.service.OperationService;
import com.yaml.service.OperationServiceImpl;

public class Main {

	public static void main(String[] args) {
		int maximumObstacle = 3;
		int numberOfPlayers = 2;
		boolean isGameCompleted = false;
		
		Board board = new Board();
		Dice dice = new Dice();
		Snake[] snakes = generateSnakes(maximumObstacle);
		Ladder[] ladders = generateLadders(maximumObstacle);
		Player[] players = generatePlayers(numberOfPlayers);
		
		Player currentPlayer = null;
		OperationService operationService = new OperationServiceImpl(board, snakes, ladders, players);
		operationService.displayBoard();
		
		/* play:
		 * player roll the dice
		 * 	move player position to a new position => current position + dice value
		 *   end condition => maximum 
		 *  check Obstacle conditions =? new position == snake.startingPosition
		 *  	-> snake  -> new position == snake.startingPosition  
		 *  		: move user position to end position of snake
		 *  	-> ladder -> new position == ladder.startingPosition
		 *  		: move user position to end position of ladder
		 * move player-1 to end of array
		*/
		while(!isGameCompleted) {
			currentPlayer = players[0];
			
			System.out.println(currentPlayer.getName()+" rolling dice.");
			int diceValue = dice.roll();
			System.out.println(diceValue);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			operationService.moveIcon(currentPlayer, diceValue); // move current player to new position and check not exceed the board
			if (operationService.isObstaclePosition(currentPlayer)) { // snake or ladder exists in user position current position
				Obstacle obstacle = operationService.getObstacle(currentPlayer);
				operationService.moveIcon(currentPlayer, obstacle.getEndingPosition());
				if (obstacle instanceof Snake) {
					System.out.println(currentPlayer.getName()+" caught by snake. Jump to new position :"+currentPlayer.getPosition());
				} else {
					System.out.println(currentPlayer.getName()+" got a ladder. Jump to new position :"+currentPlayer.getPosition());
				}
			}
			
			isGameCompleted = operationService.isPlayerWin(currentPlayer); 
			if (isGameCompleted) {
				System.out.println("Congratulations!! "+currentPlayer.getName()+" win the match");
			}
			operationService.displayBoard();
			
			// move user to last for his chance
			operationService.rollBack();
		}
		
	}
	
	private static Player[] generatePlayers(int numberOfPlayers) {
		Player[] players = new Player[numberOfPlayers];
		players[0] = new Player("Player1", "P1");
		players[1] = new Player("Player2", "P2");
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
