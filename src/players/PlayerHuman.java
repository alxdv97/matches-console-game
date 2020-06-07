package players;

import players.AbstractPlayer;
import services.ConsoleHelper;
import services.Game;

public class PlayerHuman extends AbstractPlayer {
    public PlayerHuman(Game game) {
        super(game);
    }

    @Override
    public void turn() {
        ConsoleHelper.writeCurrentState(game.getMatches());
        game.setPlayerTurn(ConsoleHelper.readTurn());

        while (game.getPlayerTurn() < 1 || game.getPlayerTurn() > 3) {
            ConsoleHelper.writeIncorrectAmount();
            ConsoleHelper.writeCurrentState(game.getMatches());
            game.setPlayerTurn(ConsoleHelper.readTurn());
        }

        game.reduceMatches(game.getPlayerTurn());
    }
}
