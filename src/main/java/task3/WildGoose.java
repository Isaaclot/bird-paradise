package task3;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/3/1 9:51 AM
 */
public class WildGoose extends Bird implements IFly, ISwim {

    public static final String WILD_GOOSE = "WildGoose";

    public WildGoose() {
        super(WILD_GOOSE);
        this.flier = new Flier(WILD_GOOSE);
        this.swimmer = new Swimmer(WILD_GOOSE);
    }

    Flier flier;
    Swimmer swimmer;


    String getBirdName() {
        return WILD_GOOSE;
    }

    public String flying(String clock) {
        return flier.flying(clock);
    }


    @Override
    public String swimming(String clock) {
        return swimmer.swimming(clock);
    }
}