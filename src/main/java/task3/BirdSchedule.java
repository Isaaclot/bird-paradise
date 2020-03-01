package task3;

import java.util.Arrays;
import java.util.List;

/**
 * @author
 * @since 2020/3/1 10:23 AM
 */
public class BirdSchedule {
    List<Bird> birdList;

    public BirdSchedule() {
        birdList = initBirdList();
    }

    private List<Bird> initBirdList() {
        return Arrays.asList(new WildGoose(), new Swallow(), new Penguin());
    }

    public String eating(String clock) {
        StringBuilder printer = new StringBuilder();
        for (Bird bird : birdList) {
            printer.append(bird.eating(clock)).append("\n");
        }
        return printer.toString();
    }

    public String walking(String clock) {
        StringBuilder printer = new StringBuilder();
        for (Bird bird : birdList) {
            printer.append(bird.walking(clock)).append("\n");
        }
        return printer.toString();
    }

    public String performing(String clock) {
        StringBuilder printer = new StringBuilder();
        for (Bird bird : birdList) {
            printer.append(bird.performing(clock)).append("\n");
        }
        return printer.toString();
    }

    public String flying(String clock) {
        StringBuilder printer = new StringBuilder();
        for (Bird bird : birdList) {
            if (bird instanceof IFly)
                printer.append(((IFly) bird).flying(clock)).append("\n");
        }
        return printer.toString();
    }

    public String swimming(String clock) {
        StringBuilder printer = new StringBuilder();
        for (Bird bird : birdList) {
            if (bird instanceof ISwim)
                printer.append(((ISwim) bird).swimming(clock)).append("\n");
        }
        return printer.toString();
    }

    public String programming(String clock) {
        StringBuilder printer = new StringBuilder();
        for (Bird bird : birdList) {
            if (bird instanceof IProgram)
                printer.append(((IProgram) bird).programming(clock)).append("\n");
        }
        return printer.toString();
    }

    public String building(String clock) {
        StringBuilder printer = new StringBuilder();
        for (Bird bird : birdList) {
            if (bird instanceof IBuildHouse)
                printer.append(((IBuildHouse) bird).building(clock)).append("\n");
        }
        return printer.toString();
    }
}
