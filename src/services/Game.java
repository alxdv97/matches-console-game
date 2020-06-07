package services;

import players.PlayerBot;
import players.PlayerHuman;

public class Game {
    private int matches;
    private int playerTurn;

    public static void main(String[] args) {
        Game game = new Game();
        game.startGame(game);
    }

    private void startGame(Game game) {
        matches = 20;
        ConsoleHelper.writeCurrentState(matches);
        PlayerBot bot = new PlayerBot(game);
        PlayerHuman human = new PlayerHuman(game);
        bot.turn();
        while (matches > 1) {
            human.turn();
            bot.turn();
        }
    }

    public void reduceMatches(int reduceValue) {
        if (reduceValue < matches) {
            matches = matches - reduceValue;
        }
        if (matches == 1) {
            gameOver();
        }
    }

    public void gameOver() {
        ConsoleHelper.writeGameOver();
    }

    public int getMatches() {
        return matches;
    }


    public int getPlayerTurn() {
        return playerTurn;
    }

    public void setPlayerTurn(int playerTurn) {
        this.playerTurn = playerTurn;
    }
}
