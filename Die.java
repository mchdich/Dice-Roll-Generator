import java.util.Random;

public class Die {
    private int faceValue;

    //constructor sets facevalue to 1
    public Die() {
        faceValue = 1;
    }

    //getter
    public int getFaceValue() {
        return faceValue;
    }

    //setter
    public void setFaceValue(int value) {
        faceValue = value;
    }

    //generates a random number between 1 and 6 and sets facevalue to that number
    public void roll() {
        Random random = new Random();
        int randInt = random.nextInt(6) + 1;
        setFaceValue(randInt);
    }
}
