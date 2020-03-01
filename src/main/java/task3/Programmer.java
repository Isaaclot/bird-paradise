package task3;

/**
 * @author
 * @since 2020/3/1 5:37 PM
 */
public class Programmer extends Bird implements IProgram {

    public Programmer(String birdName) {
        super(birdName);
    }

    @Override
    String getBirdName() {
        return super.getBirdName();
    }

    @Override
    public String programming(String clock) {
        return reportStatus(clock, "programming");
    }
}
