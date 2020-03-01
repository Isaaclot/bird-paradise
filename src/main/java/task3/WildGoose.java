package task3;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/3/1 9:51 AM
 */
public class WildGoose extends Bird implements IFly, ISwim {

    public WildGoose(String birdName) {
        super(birdName);
        this.flier = new Flier(birdName);
        this.swimmer = new Swimmer(birdName);
    }

    Flier flier;
    Swimmer swimmer;


    String getBirdName() {
        return "WildGoose";
    }

    public String flying(String clock) {
        return flier.flying(clock);
    }


    @Override
    public String swimming(String clock) {
        return swimmer.swimming(clock);
    }
}