public class Bowling {

    private int[] frames = new int[20];
    private int frame=0;

    public void roll(int i) {
        frames[frame]=i;
        frame++;
    }

    public int score() {
        int score=0;
        int spareCalculate=0;

        for (int i = 0; i < frames.length; i+=2) {
            if (frames[i]+frames[i+1]==10){
                score+=frames[i]+frames[i+1]+frames[i+2];
            }else {
                score+=frames[i]+frames[i+1];
            }
        }
        return score;
    }
}
