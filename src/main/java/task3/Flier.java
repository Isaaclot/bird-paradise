package task3;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/3/1 3:24 PM
 */
public class Flier extends Bird implements IFly {
    public Flier(String birdName) {
        super(birdName);
    }

    @Override
    public String flying(String clock) {
        return reportStatus("flying", clock);
    }
}
