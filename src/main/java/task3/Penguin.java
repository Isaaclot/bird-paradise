package task3;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/3/1 10:13 AM
 */
public class Penguin extends Bird implements ISwim {

    public static final String PENGUIN = "Penguin";
    Flier flier;
    Swimmer swimmer;

    public Penguin() {
        super(PENGUIN);
        flier = new Flier(PENGUIN);
        swimmer = new Swimmer(PENGUIN);
    }


    @Override
    String getBirdName() {
        return "Penguin";
    }

    @Override
    public String swimming(String clock) {
        return swimmer.swimming(clock);
    }
}
