import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

public class BowlingTest {

    @Test
    public void when_all_rolls_are_zero_then_score_is_zero(){
        Bowling bowling = new Bowling();
        for (int i = 0; i < 20; i++) {
            bowling.roll(0);
        }

        assertEquals(0,bowling.score());
    }

    @Test
    public void when_all_rolls_are_one_then_score_is_twenty(){
        Bowling bowling = new Bowling();
        for (int i = 0; i < 20; i++) {
            bowling.roll(1);
        }
        assertEquals(20,bowling.score());
    }

    @Test
    public void when_rolls_are_5_5_3_then_score_must_be_16(){
        Bowling bowling = new Bowling();
        bowling.roll(5);
        bowling.roll(5);
        bowling.roll(3);
        for (int i = 0; i < 17; i++) {
            bowling.roll(0);
        }
        assertEquals(16,bowling.score());
    }

}
