package task1;

public class BirdSchedule {
    private String clock;
    private String birdName;
    private String action;

    public BirdSchedule(String clock, String birdName, String action) {
        this.clock = clock;
        this.birdName = birdName;
        this.action = action;
    }

    public String schedule() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder
                .append("It's ")
                .append(clock)
                .append(", I'm ")
                .append(birdName)
                .append(", I'm ")
                .append(action);
        return stringBuilder.toString();
    }
}
