package task3;

/**
 * @author
 * @since 2020/3/1 10:11 AM
 */
public class Swallow extends Flier implements IFly, IProgram {

    public static final String SWALLOW = "Swallow";
    Flier flier;

    Programmer programmer;

    public Swallow() {
        super(SWALLOW);
        this.flier = new Flier(SWALLOW);
        this.programmer = new Programmer(SWALLOW);
    }

    @Override
    String getBirdName() {
        return SWALLOW;
    }

    @Override
    public String flying(String clock) {
        return flier.flying(clock);
    }

    @Override
    public String programming(String clock) {
        return programmer.programming(clock);
    }
}
