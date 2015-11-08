package requirements;

/**
 * Created by squeaky on 11/2/15.
 */
public class Requirement {
    private RequirementState requiredState;
    private int requiredTotal;
    private Target requiredTarget;

    public Requirement(RequirementState requiredState, int requiredTotal, Target requiredTarget) {
        this.requiredState = requiredState;
        this.requiredTotal = requiredTotal;
        this.requiredTarget = requiredTarget;
    }

    public Target getRequiredTarget() {
        return requiredTarget;
    }

    public RequirementState getRequiredState() {
        return requiredState;
    }

    public int getRequiredTotal() {
        return requiredTotal;
    }
}
