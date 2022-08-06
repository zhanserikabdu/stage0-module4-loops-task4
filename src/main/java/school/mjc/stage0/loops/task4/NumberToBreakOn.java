package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
        if (toBreakWith > numberToGoUntil) {
            System.out.println("iterating till the end");
            for(int b =1; b < toBreakWith; b++) {
                System.out.println(b);
            }
        } else {
            for (int i = 1; i <= numberToGoUntil; i++) {
                if (i == 6) {
                    break;
                }
                System.out.println(i);
            }
        }
    }
}


