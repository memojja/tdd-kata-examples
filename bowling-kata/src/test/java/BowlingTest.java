import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class BowlingTest {

    private Bowling bowling = new Bowling();

    @Test
    public void when_all_rolls_are_zero_then_score_is_zero(){
        rollMany(0,20);
        assertEquals(0,bowling.score());
    }

    @Test
    public void when_all_rolls_are_one_then_score_is_twenty(){
        rollMany(1,20);
        assertEquals(20,bowling.score());
    }

    @Test
    public void when_rolls_are_5_5_3_then_score_must_be_16(){
        rollSpare();
        bowling.roll(3);
        for (int i = 0; i < 17; i++) {
            bowling.roll(0);
        }
        assertEquals(16,bowling.score());
    }


    @Test
    public void when_rolls_are_10_3_3_then_Score_must_be_22(){
        rollStrike();
        bowling.roll(3);
        bowling.roll(3);
        rollMany(0,16);
        assertEquals(22,bowling.score());
    }

    private void rollMany(int pins,int count) {
        for (int i = 0; i < count; i++) {
            bowling.roll(pins);
        }
    }
    private void rollStrike() {
        bowling.roll(10);
    }

    private void rollSpare() {
        bowling.roll(5);
        bowling.roll(5);
    }

}
