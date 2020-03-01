package task1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BirdParadisePrinterTest {


    @Test
    public void bird_paradise_test() {
        BirdParadisePrinter birdParadisePrinter = new BirdParadisePrinter();
        String excepted = "It's 7:00, I'm WildGoose, I'm eating\n" +
                "It's 7:00, I'm Swallow, I'm eating\n" +
                "It's 8:00, I'm WildGoose, I'm walking\n" +
                "It's 8:00, I'm Swallow, I'm walking\n" +
                "It's 9:00, I'm WildGoose, I'm performing\n" +
                "It's 9:00, I'm Swallow, I'm performing\n" +
                "It's 10:00, I'm WildGoose, I'm flying\n" +
                "It's 10:00, I'm Swallow, I'm flying\n";
        List<BirdSchedule> birdSchedules = new ArrayList<>();
        birdSchedules.add(new BirdSchedule("7:00", "WildGoose", "eating"));
        birdSchedules.add(new BirdSchedule("7:00", "Swallow", "eating"));
        birdSchedules.add(new BirdSchedule("8:00", "WildGoose", "walking"));
        birdSchedules.add(new BirdSchedule("8:00", "Swallow", "walking"));
        birdSchedules.add(new BirdSchedule("9:00", "WildGoose", "performing"));
        birdSchedules.add(new BirdSchedule("9:00", "Swallow", "performing"));
        birdSchedules.add(new BirdSchedule("10:00", "WildGoose", "flying"));
        birdSchedules.add(new BirdSchedule("10:00", "Swallow", "flying"));
        assertThat(birdParadisePrinter.scheduleTextPrint(birdSchedules), is(excepted));

    }
}
