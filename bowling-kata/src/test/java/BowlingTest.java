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
}
