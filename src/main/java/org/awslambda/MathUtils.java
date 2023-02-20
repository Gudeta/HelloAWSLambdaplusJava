package org.awslambda;

import java.util.Arrays;
import java.util.List;

public class MathUtils {
    public static void main(String[] args) {
        multiply(3,3);
        System.out.println(multiply(4,4));
        System.out.println(printListOfNumber());
    }

    public static int multiply(int x, int y){
        return x * y;
    }
    public static boolean printListOfNumber(){
        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6);
         numbers.forEach((Integer number) -> System.out.println(number));

        return false;
    }
}