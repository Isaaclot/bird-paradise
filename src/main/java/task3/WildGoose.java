package task3;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/3/1 9:51 AM
 */
public class WildGoose extends Bird implements IFly{

    Flier flier;

    public WildGoose() {
        this.flier = new Flier();
    }

    String getBirdName() {
        return "WildGoose";
    }

    public String flying(String clock) {
        return flier.flying(clock, getBirdName());
    }

}