package com.yaml.service;

import com.yaml.model.Obstacle;
import com.yaml.model.Player;

public interface OperationService {
	public void displayBoard();
	public boolean isPlayerWin(Player currentPlayer);
	public void moveIcon(Player currentPlayer, int diceValue);
	public boolean isObstaclePosition(Player currentPlayer);
	public Obstacle getObstacle(Player currentPlayer);
	public void rollBack();
}
