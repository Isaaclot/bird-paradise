package task3;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/3/1 10:03 AM
 */
public class Bird {
    public String birdName;

    public Bird() {
    }

    public Bird(String birdName) {
        this.birdName = birdName;
    }

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

    public String reportStatus(String action, String clock) {
        return String.format("It's %s, I'm %s, I'm %s", clock, getBirdName(), action);
    }

    String getBirdName() {
        return birdName;
    }

}
