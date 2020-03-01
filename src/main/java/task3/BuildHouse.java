package task3;

/**
 * @author
 * @since 2020/3/1 5:46 PM
 */
public class BuildHouse extends Bird implements IBuildHouse {
    public BuildHouse(String birdName) {
        super(birdName);
    }

    @Override
    public String building(String clock) {
        return reportStatus(clock, "building");
    }
}
