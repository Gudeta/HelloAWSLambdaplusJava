package org.awslambda;

import java.util.Arrays;
import java.util.List;

public class LambdaExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Adam","Adam1", "Eve");

        // Using a lambda expression to sort the names
        names.sort((name1, name2) -> name1.compareTo(name2));

        // Using a lambda expression to print each name
        names.forEach(name -> System.out.println(name));
    }
    /*In this example, we have a list of names that we want to sort and print. Instead of using a traditional anonymous inner class, we use a lambda expression to define the sorting and printing behavior.

The lambda expression (name1, name2) -> name1.compareTo(name2) is used to define a Comparator that sorts the names in ascending order. The sort method from the List interface takes a Comparator as an argument, so we pass the lambda expression directly as an argument.

The lambda expression name -> System.out.println(name) is used to define a Consumer that prints each name. The forEach method from the List interface takes a Consumer as an argument, so we pass the lambda expression directly as an argument.

Overall, using lambda expressions can make code more concise and readable, especially when working with functional interfaces like Comparator and Consumer.*/
}