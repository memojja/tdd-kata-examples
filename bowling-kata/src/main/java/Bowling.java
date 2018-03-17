public class Bowling {

    private int[] frames = new int[20];
    private int frame=0;

    public void roll(int pins) {
        frames[frame]=pins;
        if ((pins == 10)) {
            frame += 2;
        } else {
            frame++;
        }

    }

    public int score() {
        int score=0;
        for (int i = 0; i < frames.length; i+=2) {
            if (isStrike(frames[i])){
                score+=frames[i]+frames[i+2]+frames[i+3];
            }
            else if (isSpare(i)){
                score+=frames[i]+frames[i+1]+frames[i+2];
            }
            else {
                score+=frames[i]+frames[i+1];
            }
        }
        return score;
    }

    private boolean isStrike(int frame) {
        return frame ==10;
    }

    private boolean isSpare(int i) {
        return frames[i]+frames[i+1]==10;
    }
}
