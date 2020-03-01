package task2;

/**
 * @author
 * @since 2020/3/1 10:03 AM
 */
public class Bird {

    private String clock;

    public Bird(String clock) {
        this.clock = clock;
    }

    public String eating() {
        String action = "eating";
        return reportStatus(action, this.clock);
    }

    public String walking() {
        String action = "walking";
        return reportStatus(action, this.clock);
    }

    public String performing() {
        String action = "performing";
        return reportStatus(action, this.clock);
    }

    public String flying() {
        return reportStatus("flying", this.clock);
    }

    public String swimming() {
        return reportStatus("swimming", this.clock);
    }

    private String reportStatus(String action, String clock) {
        return String.format("It's %s, I'm %s, I'm %s", clock, getBirdName(), action);
    }

    String getBirdName() {
        return "bird";
    }

}
