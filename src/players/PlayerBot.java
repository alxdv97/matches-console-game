package players;

import services.ConsoleHelper;
import services.Game;

public class PlayerBot extends AbstractPlayer {
    public PlayerBot(Game game) {
        super(game);
    }

    @Override
    public void turn() {
        if (game.getMatches() == 20) {
            ConsoleHelper.writeBotTurn(3);
            game.reduceMatches(3);
        } else if (game.getMatches() > 4) {
            ConsoleHelper.writeBotTurn(4 - game.getPlayerTurn());
            game.reduceMatches(4 - game.getPlayerTurn());
        } else {
            ConsoleHelper.writeBotTurn(game.getMatches() - 1);
            game.reduceMatches(game.getMatches() - 1);
        }
    }
}
