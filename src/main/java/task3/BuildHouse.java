package task3;

import task3.util.FormatPrinter;

/**
 * @author
 * @since 2020/3/1 5:46 PM
 */
public class BuildHouse implements IBuildHouse {
    private String birdName;

    public BuildHouse(String birdName) {
        this.birdName = birdName;
    }

    @Override
    public String building(String clock) {
        return FormatPrinter.reportStatus(clock, birdName, "building");
    }
}
