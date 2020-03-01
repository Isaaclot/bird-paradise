package task3.util;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/3/1 10:15 PM
 */
public class FormatPrinter {
    public static String reportStatus(String clock, String birdName, String action) {
        return String.format("It's %s, I'm %s, I'm %s", clock, birdName, action);
    }
}
