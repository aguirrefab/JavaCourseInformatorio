package Complementary_1;

public class Exercise4 {

    public static int factorial(int num){
        int factorial = 1;
        for (int i = 1; i <= num; i++){
            factorial *= i;
        }
        return factorial;
    }
}
