package task2;

import java.util.Arrays;
import java.util.List;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/3/1 10:23 AM
 */
public class BirdSchedule {
    List<Bird> birdList;
    private String clock;

    public BirdSchedule(String clock) {
        this.clock = clock;
        birdList = initBirdList();
    }

    private List<Bird> initBirdList() {
        return Arrays.asList(new WildGoose(clock), new Swallow(clock), new Penguin(clock));
    }

    public String eating() {
        StringBuilder printer = new StringBuilder();
        for (Bird bird : birdList) {
            printer.append(bird.eating()).append("\n");
        }
        return printer.toString();
    }

    public String walking() {
        StringBuilder printer = new StringBuilder();
        for (Bird bird : birdList) {
            printer.append(bird.walking()).append("\n");
        }
        return printer.toString();
    }

    public String performing() {
        StringBuilder printer = new StringBuilder();
        for (Bird bird : birdList) {
            printer.append(bird.performing()).append("\n");
        }
        return printer.toString();
    }

    public String flying() {
        StringBuilder printer = new StringBuilder();
        for (Bird bird : birdList) {
            if (bird instanceof Penguin) continue;
            printer.append(bird.flying()).append("\n");
        }
        return printer.toString();
    }

    public String swimming() {
        StringBuilder printer = new StringBuilder();
        for (Bird bird : birdList) {
            if (bird instanceof Swallow) continue;
            printer.append(bird.swimming()).append("\n");
        }
        return printer.toString();
    }
}
