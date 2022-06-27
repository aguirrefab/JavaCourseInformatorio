package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise7 {

    public static List<String> generateStringArray(int num1, int num2){

        List<String> fizzBuzzList = new ArrayList<>();

        for (int i = num1; i < num2; i++){

            if (i % 2 == 0 && i % 3 == 0) {
                String str = "Fizz Buzz";
                fizzBuzzList.add(str);
            } else if (i % 2 == 0){
                String str = "Fizz";
                fizzBuzzList.add(str);
            } else if (i % 3 == 0) {
                String str = "Buzz";
                fizzBuzzList.add(str);
            } else{
                String j = Integer.toString(i);
                fizzBuzzList.add(j);
            }
        }
        return fizzBuzzList;
    }
}
