public class Bowling {
    private int score;
    public int roll(int i) {
        score+=i;
        return i;
    }

    public int score() {
        return score;
    }
}
