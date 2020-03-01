package task2;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author
 * @since 2020/3/1 9:49 AM
 */
public class WildGooseTest {
    @Test
    public void test_7_eating() {
        WildGoose wildGoose = new WildGoose("7:00");
        assertThat(wildGoose.eating(), is("It's 7:00, I'm WildGoose, I'm eating"));
    }

    @Test
    public void test_8_walking() {
        WildGoose wildGoose = new WildGoose("8:00");
        assertThat(wildGoose.walking(), is("It's 8:00, I'm WildGoose, I'm walking"));
    }

    @Test
    public void test_9_performing() {
        WildGoose wildGoose = new WildGoose("9:00");
        assertThat(wildGoose.performing(), is("It's 9:00, I'm WildGoose, I'm performing"));
    }

    @Test
    public void test_10_flying() {
        WildGoose wildGoose = new WildGoose("10:00");
        assertThat(wildGoose.flying(), is("It's 10:00, I'm WildGoose, I'm flying"));
    }

    @Test
    public void test_11_swimming() {
        WildGoose wildGoose = new WildGoose("11:00");
        assertThat(wildGoose.swimming(), is("It's 11:00, I'm WildGoose, I'm swimming"));
    }
}
