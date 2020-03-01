package task3;

/**
 * @author
 * @since 2020/3/1 10:13 AM
 */
public class Penguin extends Bird implements ISwim, IBuildHouse {

    public static final String PENGUIN = "Penguin";
    Flier flier;
    Swimmer swimmer;
    BuildHouse buildHouse;

    public Penguin() {
        super(PENGUIN);
        flier = new Flier(PENGUIN);
        swimmer = new Swimmer(PENGUIN);
        buildHouse = new BuildHouse(PENGUIN);
    }


    @Override
    String getBirdName() {
        return "Penguin";
    }

    @Override
    public String swimming(String clock) {
        return swimmer.swimming(clock);
    }

    @Override
    public String building(String clock) {
        return buildHouse.building(clock);
    }
}
