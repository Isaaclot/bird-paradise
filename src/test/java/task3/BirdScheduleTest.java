package task3;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author
 * @since 2020/3/1 10:20 AM
 */
public class BirdScheduleTest {
    @Test
    public void test_7_schedule() {
        BirdSchedule birdSchedule = new BirdSchedule();
        String excepted = "It's 7:00, I'm WildGoose, I'm eating\n" +
                "It's 7:00, I'm Swallow, I'm eating\n" +
                "It's 7:00, I'm Penguin, I'm eating\n";
        assertThat(birdSchedule.eating("7:00"), is(excepted));
    }

    @Test
    public void test_8_schedule() {
        BirdSchedule birdSchedule = new BirdSchedule();
        String excepted = "It's 8:00, I'm WildGoose, I'm walking\n" +
                "It's 8:00, I'm Swallow, I'm walking\n" +
                "It's 8:00, I'm Penguin, I'm walking\n";
        assertThat(birdSchedule.walking("8:00"), is(excepted));
    }

    @Test
    public void test_9_schedule() {
        BirdSchedule birdSchedule = new BirdSchedule();
        String excepted = "It's 9:00, I'm WildGoose, I'm performing\n" +
                "It's 9:00, I'm Swallow, I'm performing\n" +
                "It's 9:00, I'm Penguin, I'm performing\n";
        assertThat(birdSchedule.performing("9:00"), is(excepted));
    }

    @Test
    public void test_14_schedule() {
        BirdSchedule birdSchedule = new BirdSchedule();
        String excepted = "It's 14:00, I'm Penguin, I'm building\n";
        assertThat(birdSchedule.building("14:00"), is(excepted));
    }

    @Test
    public void test_10_schedule() {
        BirdSchedule birdSchedule = new BirdSchedule();
        String excepted = "It's 10:00, I'm WildGoose, I'm flying\n" +
                "It's 10:00, I'm Swallow, I'm flying\n";
        assertThat(birdSchedule.flying("10:00"), is(excepted));
    }

    @Test
    public void test_11_schedule() {
        BirdSchedule birdSchedule = new BirdSchedule();
        String excepted = "It's 11:00, I'm WildGoose, I'm swimming\n" +
                "It's 11:00, I'm Penguin, I'm swimming\n";
        assertThat(birdSchedule.swimming("11:00"), is(excepted));
    }

    @Test
    public void test_13_schedule() {
        BirdSchedule birdSchedule = new BirdSchedule();
        String excepted = "It's 13:00, I'm WildGoose, I'm programming\n" +
                "It's 13:00, I'm Swallow, I'm programming\n";
        assertThat(birdSchedule.programming("13:00"), is(excepted));
    }
}
