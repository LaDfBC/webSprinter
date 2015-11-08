package actions;

import players.Player;
import players.PlayerSide;

/**
 * Created by squeaky on 11/7/15.
 */
public class Effect {
    private PlayerSide side;
    private Change change;
    private Integer value;

    public Effect(PlayerSide side, Change change, Integer value) {
        this.side = side;
        this.change = change;
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public PlayerSide getSide() {
        return side;
    }

    public Change getChange() {
        return change;
    }

}
