package src;
public class Exercise5 {
    public static int productOfAddition(int num1, int num2) {
        int result = 0;
        for (int i = 0; i < num2; i++) {
            result += num1;
        }
        return result;
    }
}
