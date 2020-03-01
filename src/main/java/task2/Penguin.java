package task2;

/**
 * @author
 * @since 2020/3/1 10:13 AM
 */
public class Penguin extends Bird {
    public Penguin(String clock) {
        super(clock);
    }

    @Override
    String getBirdName() {
        return "Penguin";
    }
}
