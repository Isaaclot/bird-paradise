package task3;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/3/1 3:24 PM
 */
public class Flier implements IFly {
    @Override
    public String flying(String clock, String bird) {
        return String.format("It's %s, I'm %s, I'm %s", clock, bird, "flying");
    }
}
