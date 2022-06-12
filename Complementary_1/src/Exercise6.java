package Complementary_1;

public class Exercise6 {

    public static int exponential(int num1,int num2) {
        int result = 1;

        for (int i = 0; i < num2; i++) {
            result *= num1;
        }
        return result;
    }



}
