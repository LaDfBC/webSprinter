package cards;

import actions.Action;
import actions.Effect;
import requirements.Requirement;

import java.awt.*;
import java.util.List;


/**
 * Created by squeaky on 11/1/15.
 */
public abstract class Card {
    public Image getCardImage(int cardNumber) {
        return null; //TODO: Grab images
    }

    public abstract List<Requirement> getRequirements();
    public abstract Action getAction();
}
