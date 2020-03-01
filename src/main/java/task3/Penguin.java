package task3;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/3/1 10:13 AM
 */
public class Penguin extends Bird implements ISwim {

    Flier flier;
    Swimmer swimmer;

    public Penguin(String birdName) {
        super(birdName);
        flier = new Flier(birdName);
        swimmer = new Swimmer(birdName);
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
