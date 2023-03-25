package StreamApiLearn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProcessCollections {
    public static void main(String[] args) {

        List<Ball> balls=List.of(
                new Ball(BallColor.BLUE, 20, 24.6),
                new Ball(BallColor.GREEN, 87, 128),
                new Ball(BallColor.RED, 5, 212.3),
                new Ball(BallColor.BLUE, 10, 35.5),
                new Ball(BallColor.GREEN, 12, 11223.5)
        );

        //1. Create a list of Green balls
        List<Ball> greenBalls=new ArrayList<>();
        for(Ball b:balls){ //external Iterator
            if(b.getBallColor() == BallColor.GREEN){
                greenBalls.add(b);
            }
        }

        //2. Sort the balls on the Radius
        Collections.sort(greenBalls, new Comparator<Ball>() {
            @Override
            public int compare(Ball o1, Ball o2) {
                return (Integer.compare(o1.getRadius(), o2.getRadius()));
            }
        });
        // 3. Output the value
        for(Ball b :greenBalls){
            System.out.println(b);
           /* if (b.getBallColor() == BallColor.GREEN){
                greenBalls.add(b);
            }*/
        }
    }
}
