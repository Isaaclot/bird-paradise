package task3;

import task3.util.FormatPrinter;

/**
 * @author
 * @since 2020/3/1 3:24 PM
 */
public class Flier extends Bird implements IFly {
    private String birdName;

    public Flier(String birdName) {
        this.birdName = birdName;
    }

    @Override
    public String flying(String clock) {
        return FormatPrinter.reportStatus(clock, birdName, "flying");
    }
}
