package task3;

import org.junit.Test;
import task3.WildGoose;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/3/1 9:49 AM
 */
public class WildGooseTest {
    @Test
    public void test_7_eating() {
        WildGoose wildGoose = new WildGoose();
        assertThat(wildGoose.eating("7:00"), is("It's 7:00, I'm WildGoose, I'm eating"));
    }

    @Test
    public void test_8_walking() {
        WildGoose wildGoose = new WildGoose();
        assertThat(wildGoose.walking("8:00"), is("It's 8:00, I'm WildGoose, I'm walking"));
    }

    @Test
    public void test_9_performing() {
        WildGoose wildGoose = new WildGoose();
        assertThat(wildGoose.performing("9:00"), is("It's 9:00, I'm WildGoose, I'm performing"));
    }

    @Test
    public void test_10_flying() {
        WildGoose wildGoose = new WildGoose();
        assertThat(wildGoose.flying("10:00"), is("It's 10:00, I'm WildGoose, I'm flying"));
    }

    @Test
    public void test_11_swimming() {
        WildGoose wildGoose = new WildGoose();
        assertThat(wildGoose.swimming("11:00"), is("It's 11:00, I'm WildGoose, I'm swimming"));
    }
}
