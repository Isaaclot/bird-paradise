package task3;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/3/1 11:59 AM
 */
public class Swimmer extends Bird {


    @Override
    public String swimming(String clock) {
        return reportStatus("swimming", clock);
    }
}
