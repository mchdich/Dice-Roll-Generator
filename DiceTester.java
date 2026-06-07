//rolls both dice 1000 times, recording the frequency of each face value before printing them out with a histograph
public class DiceTester {
    public static void main(String[] args) {
        int rolls = 1000;
        //only indeces 2-12 are used
        int[] occurrences = new int[13];
        //create Dice object (contains two dice)
        Dice die = new Dice();
        for (int i = 0; i < rolls; i++) {
            die.roll();
            int currValue = die.getFaceValue();
            occurrences[currValue]++;
        }
        for (int i = 2; i < 13; i++) {
            System.out.println("Number of " + i + "s are " + occurrences[i]);
        }
        System.out.println("\nGraph");

        //histogram logic
        for (int y = 175; y >= 0; y -= 25) {
            //handle spacing for y-axis labels to keep alignment
            String yLabel = "" + y;
            if (y < 100) {
                yLabel = " " + yLabel;
            }
            if (y < 10) {
                yLabel = " " + yLabel;
            }

            System.out.print(yLabel + "|");

            for (int x = 2; x <= 12; x++) {
                if (occurrences[x] >= y) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        //x-axis
        System.out.println("--------------------------------");
        System.out.print(" "); //initial alignment offset
        for (int i = 2; i <= 12; i++) {
            System.out.print(i);
            //1 space if 2-digit, 2 spaces if 1-digit
            if (i < 10) {
                System.out.print("  ");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
