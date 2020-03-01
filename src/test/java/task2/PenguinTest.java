package task2;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author
 * @since 2020/3/1 10:12 AM
 */
public class PenguinTest {

    @Test
    public void test_7_eating() {
        Penguin penguin = new Penguin("7:00");
        assertThat(penguin.eating(), is("It's 7:00, I'm Penguin, I'm eating"));
    }

    @Test
    public void test_8_walking() {
        Penguin penguin = new Penguin("8:00");
        assertThat(penguin.walking(), is("It's 8:00, I'm Penguin, I'm walking"));
    }

    @Test
    public void test_9_performing() {
        Penguin penguin = new Penguin("9:00");
        assertThat(penguin.performing(), is("It's 9:00, I'm Penguin, I'm performing"));
    }


    @Test
    public void test_11_swimming() {
        Penguin penguin = new Penguin("11:00");
        assertThat(penguin.swimming(), is("It's 11:00, I'm Penguin, I'm swimming"));
    }
}
