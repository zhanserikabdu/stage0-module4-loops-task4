package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if (numberToSkip > lastInRow) {
            System.out.println("number to skip is bugger then the last");
        } else if (lastInRow < 0) {
            System.out.println("last number in row is negative");
        } else {
            int sum = 0;
            int sum2 = 0;
            for (int i = 0; i <= lastInRow; i++) {
                if (i <= numberToSkip)
                    sum += i;
                if (i > numberToSkip)
                    sum2 += i;
            }
            System.out.println("skipped sum is " + sum + "\ncounted sum is " + sum2);
        }
    }
}



