package task3;

import task3.util.FormatPrinter;

/**
 * @author
 * @since 2020/3/1 11:59 AM
 */
public class Swimmer implements ISwim {
    private String birdName;

    public Swimmer(String birdName) {
        this.birdName = birdName;
    }

    @Override
    public String swimming(String clock) {
        return FormatPrinter.reportStatus(clock, birdName, "swimming");
    }
}
