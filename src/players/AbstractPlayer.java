package players;

import services.Game;

public abstract class AbstractPlayer {
    public Game game;

    public AbstractPlayer(Game game) {
        this.game = game;
    }

    abstract public void turn();
}
