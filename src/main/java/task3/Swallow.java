package task3;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/3/1 10:11 AM
 */
public class Swallow extends Flier implements IFly {

    Flier flier;

    public Swallow(String birdName) {
        super(birdName);
        this.flier = new Flier(getBirdName());
    }

    @Override
    String getBirdName() {
        return "Swallow";
    }

    @Override
    public String flying(String clock) {
        return flier.flying(clock);
    }

}
