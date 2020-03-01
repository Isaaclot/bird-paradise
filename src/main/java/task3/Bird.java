package task3;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/3/1 10:03 AM
 */
public abstract class Bird {

    public String eating(String clock) {
        String action = "eating";
        return reportStatus(action, clock);
    }

    public String walking(String clock) {
        String action = "walking";
        return reportStatus(action, clock);
    }

    public String performing(String clock) {
        String action = "performing";
        return reportStatus(action, clock);
    }

    public String flying(String clock) {
        return reportStatus("flying", clock);
    }

    public String swimming(String clock) {
        return reportStatus("swimming", clock);
    }

    public String reportStatus(String action, String clock) {
        return String.format("It's %s, I'm %s, I'm %s", clock, getBirdName(), action);
    }

    String getBirdName() {
        return "bird";
    }

}
