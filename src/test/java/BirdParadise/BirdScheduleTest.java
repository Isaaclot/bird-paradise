package BirdParadise;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BirdScheduleTest {

    @Test
    public void seven_wildGoose_eating_test() {
        BirdSchedule birdSchedule = new BirdSchedule("7:00", "WildGoose", "eating");
        String excepted = "It's 7:00, I'm WildGoose, I'm eating";
        assertThat(birdSchedule.schedule(), is(excepted));
    }

}
