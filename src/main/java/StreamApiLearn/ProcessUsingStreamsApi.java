package StreamApiLearn;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProcessUsingStreamsApi {
    public static void main(String[] args) {
        List<Ball> balls=List.of(
                new Ball(BallColor.BLUE, 20, 24.6),
                new Ball(BallColor.GREEN, 87, 128),
                new Ball(BallColor.RED, 5, 212.3),
                new Ball(BallColor.BLUE, 10, 35.5),
                new Ball(BallColor.GREEN, 12, 11223.5)
        );
        //1. Create a list of Green balls
        //2. Sort the balls on the Radius
        // 3. Output the value
//can use parallelstream or Stream--
        final var greenBalls = balls.parallelStream()
                //Functional Interface
                .filter(ball -> ball.getBallColor() == BallColor.GREEN)
                .sorted(Comparator.comparing(ball -> ball.getRadius()))
                .collect(Collectors.toList());

        greenBalls.forEach(ball -> System.out.println(ball));

    }
    //Comparing a regular method with a lambda expression.

    // refering to row  22 above -1. Lambda -Anonymous method -method without a name
    // 2. Dropping the return type, access modifiers, curly braces, return keyword, type of method parameter
    //3. added ->
    //4. (b) -> b.getBallColor() == BallColor.GREEN;
    //
    //Functional Interface -have exactly one abstract method interface
    //Example Runnable interface (All util interface -consume, supplier, function,...)
    public  boolean filterValues(Ball b){
        return  b.getBallColor() == BallColor.GREEN;
    }
}
