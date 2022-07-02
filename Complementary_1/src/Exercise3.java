package src;
public class Exercise3 {
    public Exercise3() {
    }
    public static void sequenceOfNumber(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
        }
    }
}
