public class Dice {
    //2 Die objects
    private Die die1;
    private Die die2;

    //constructor that instantiates 2 Die objects and sets their facevalue to 1
    public Dice() {
        die1 = new Die();
        die2 = new Die();
        die1.setFaceValue(1);
        die2.setFaceValue(1);
    }

    //facevalue getter returns sum of facevalues of both die
    public int getFaceValue() {
        return die1.getFaceValue() + die2.getFaceValue();
    }

    //calls roll method on both dice
    public void roll() {
        die1.roll();
        die2.roll();
    }
}
