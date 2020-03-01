package task1;

import java.util.List;

public class BirdParadisePrinter {
    public String scheduleTextPrint(List<BirdSchedule> birdSchedules) {
        StringBuilder print = new StringBuilder();
        for (BirdSchedule birdSchedule : birdSchedules) {
            print.append(birdSchedule.schedule()).append("\n");
        }
        System.out.println(print);
        return print.toString();
    }
}
