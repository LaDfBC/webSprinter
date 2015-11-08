package players;

/**
 * Created by squeaky on 11/1/15.
 */
public abstract class Player {
    private int points = 0;

    public abstract int getClicks();
    public int getPoints() {
        return points;
    }

    public void scoreAgenda(int points) { //TODO: Take an agenda
        this.points += points;
    }
}
