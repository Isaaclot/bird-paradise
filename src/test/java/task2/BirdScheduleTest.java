package task2;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/3/1 10:20 AM
 */
public class BirdScheduleTest {
    @Test
    public void test_7_schedule() {
        BirdSchedule birdSchedule = new BirdSchedule("7:00");
        String excepted = "It's 7:00, I'm WildGoose, I'm eating\n" +
                "It's 7:00, I'm Swallow, I'm eating\n" +
                "It's 7:00, I'm Penguin, I'm eating\n";
        assertThat(birdSchedule.eating(), is(excepted));
    }

    @Test
    public void test_8_schedule() {
        BirdSchedule birdSchedule = new BirdSchedule("8:00");
        String excepted = "It's 8:00, I'm WildGoose, I'm walking\n" +
                "It's 8:00, I'm Swallow, I'm walking\n" +
                "It's 8:00, I'm Penguin, I'm walking\n";
        assertThat(birdSchedule.walking(), is(excepted));
    }

    @Test
    public void test_9_schedule() {
        BirdSchedule birdSchedule = new BirdSchedule("9:00");
        String excepted = "It's 9:00, I'm WildGoose, I'm performing\n" +
                "It's 9:00, I'm Swallow, I'm performing\n" +
                "It's 9:00, I'm Penguin, I'm performing\n";
        assertThat(birdSchedule.performing(), is(excepted));
    }

    @Test
    public void test_10_schedule() {
        BirdSchedule birdSchedule = new BirdSchedule("10:00");
        String excepted = "It's 10:00, I'm WildGoose, I'm flying\n" +
                "It's 10:00, I'm Swallow, I'm flying\n";
        assertThat(birdSchedule.flying(), is(excepted));
    }

    @Test
    public void test_11_schedule() {
        BirdSchedule birdSchedule = new BirdSchedule("11:00");
        String excepted = "It's 11:00, I'm WildGoose, I'm swimming\n" +
                "It's 11:00, I'm Penguin, I'm swimming\n";
        assertThat(birdSchedule.swimming(), is(excepted));
    }
}
