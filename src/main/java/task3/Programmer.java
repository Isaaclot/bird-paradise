package task3;

import task3.util.FormatPrinter;

/**
 * @author
 * @since 2020/3/1 5:37 PM
 */
public class Programmer implements IProgram {

    private String birdName;

    public Programmer(String birdName) {
        this.birdName = birdName;
    }

    @Override
    public String programming(String clock) {
        return FormatPrinter.reportStatus(clock,birdName , "programming");
    }
}
