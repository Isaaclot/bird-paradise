package task3;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/3/1 10:11 AM
 */
public class Swallow extends Bird implements IFly {

    Flier flier;

    public Swallow() {
        flier = new Flier();
    }

    @Override
    String getBirdName() {
        return "Swallow";
    }

    public String flying(String clock) {
        return flier.flying(clock, getBirdName());
    }

}
