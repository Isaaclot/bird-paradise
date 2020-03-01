package task3;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/3/1 10:11 AM
 */
public class Swallow extends Flier implements IFly {

    public static final String SWALLOW = "Swallow";
    Flier flier;

    public Swallow() {
        super(SWALLOW);
        this.flier = new Flier(SWALLOW);
    }

    @Override
    String getBirdName() {
        return SWALLOW;
    }

    @Override
    public String flying(String clock) {
        return flier.flying(clock);
    }

}
