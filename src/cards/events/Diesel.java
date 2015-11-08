package cards.events;

import actions.Action;
import actions.Change;
import actions.Effect;
import cards.Card;
import players.PlayerSide;
import requirements.Requirement;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by squeaky on 11/2/15.
 */
public class Diesel extends Card {

    @Override
    public List<Requirement> getRequirements() {
        return new ArrayList<Requirement>();
    }

    @Override
    public Action getAction() {
        return new Action() {
            @Override
            public List<Effect> getEffects() {
                ArrayList<Effect> retval = new ArrayList<>();
                Effect drawEffect = new Effect(PlayerSide.RUNNER, Change.DRAW_CARD, 3);
                retval.add(drawEffect);
                return retval;
            }
        };
    }
}
