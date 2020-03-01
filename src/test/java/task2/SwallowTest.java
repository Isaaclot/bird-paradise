package task2;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/3/1 10:10 AM
 */
public class SwallowTest {

    @Test
    public void test_7_eating() {
        Swallow swallow = new Swallow("7:00");
        assertThat(swallow.eating(), is("It's 7:00, I'm Swallow, I'm eating"));
    }

    @Test
    public void test_8_walking() {
        Swallow swallow = new Swallow("8:00");
        assertThat(swallow.walking(), is("It's 8:00, I'm Swallow, I'm walking"));
    }

    @Test
    public void test_9_performing() {
        Swallow swallow = new Swallow("9:00");
        assertThat(swallow.performing(), is("It's 9:00, I'm Swallow, I'm performing"));
    }

    @Test
    public void test_10_flying() {
        Swallow swallow = new Swallow("10:00");
        assertThat(swallow.flying(), is("It's 10:00, I'm Swallow, I'm flying"));
    }


}
