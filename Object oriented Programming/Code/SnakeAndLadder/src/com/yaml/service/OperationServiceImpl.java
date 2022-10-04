package com.yaml.service;

import com.yaml.model.Board;
import com.yaml.model.Ladder;
import com.yaml.model.Obstacle;
import com.yaml.model.Player;
import com.yaml.model.Snake;

public class OperationServiceImpl implements OperationService {
	private Board board;
	private Snake[] snakes; 
	private Ladder[] ladders;
	private Player[] players;
	
	public OperationServiceImpl(Board board, Snake[] snakes, Ladder[] ladders, Player[] players) {
		this.board = board;
		this.snakes = snakes;
		this.ladders = ladders;
		this.players = players;
	}
	
	public void displayBoard() {
		int rowSize = 10;
		int maximum = board.getSize();
		
		for (int row = 0; row<rowSize; row++) {
			System.out.print("|");
			for (int column = 0; column<rowSize; column++) {
				Obstacle obstacleStart = getObstacleStartingPosition(maximum);
				Obstacle obstacleEnd = getObstacleEndingPosition(maximum);
				Player player = getPlayerPosition(maximum);
				
				if (obstacleStart instanceof Snake) {
					System.out.print("  S+  |");
				} else if (obstacleEnd instanceof Snake) {
					System.out.print("  S-  |");
				} else if (obstacleStart instanceof Ladder) {
					System.out.print("  L+  |");
				} else if (obstacleEnd instanceof Ladder) {
					System.out.print("  L-  |");
				} else if (player != null) {
					System.out.print("  "+player.getId()+"  |");
				} else {
					if (maximum < 10) {
						System.out.print("  "+maximum+"   |");
					} else if (maximum >= 100) {
						System.out.print("  "+maximum+" |");
					} else {
						System.out.print("  "+maximum+"  |");
					}
					
				}
				maximum--;
			}
			System.out.println("");
		}
	}

	public boolean isPlayerWin(Player currentPlayer) {
		return currentPlayer.getPosition() == board.getSize();
	}

	public void moveIcon(Player currentPlayer, int diceValue) {
		int currentPosition = currentPlayer.getPosition();
		if (currentPosition + diceValue <= board.getSize()) {
			currentPlayer.setPosition(currentPosition+diceValue);
		}
	}

	public boolean isObstaclePosition(Player currentPlayer) {
		return getObstacle(currentPlayer) != null;
	}

	private Obstacle getObstacleStartingPosition(int currentPosition) {
		Obstacle obstacle = null;
		
		for (Ladder ladder : ladders) {
			if (currentPosition == ladder.getStartingPosition()) {
				obstacle = ladder;
			}
		}
		for (Snake snake : snakes) {
			if (currentPosition == snake.getStartingPosition()) {
				obstacle = snake;
			}
		}
		return obstacle;
	}
	
	private Obstacle getObstacleEndingPosition(int currentPosition) {
		Obstacle obstacle = null;
		
		for (Ladder ladder : ladders) {
			if (currentPosition == ladder.getEndingPosition()) {
				obstacle = ladder;
			}
		}
		for (Snake snake : snakes) {
			if (currentPosition == snake.getEndingPosition()) {
				obstacle = snake;
			}
		}
		return obstacle;
	}
	
	private Player getPlayerPosition(int currentPosition) {
		Player currentPlayer = null;
		
		for (Player player : players) {
			if (currentPosition == player.getPosition()) {
				currentPlayer = player;
			}
		}
		
		return currentPlayer;
	}
	
	public Obstacle getObstacle(Player currentPlayer) {
		int currentPosition = currentPlayer.getPosition();
		return getObstacleStartingPosition(currentPosition);
	}

	public void rollBack() {
		Player player = players[0];
		
		for (int i=0;i<players.length-1;i++) {
			players[i] = players[i+1];
		}
		players[players.length-1] = player;
	}
	
}
