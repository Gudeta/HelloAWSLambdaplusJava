import java.util.Arrays;
import java.util.List;

public class PlayStringFormating {
    public static void main(String[] args) {
        String ph1="90-123-3344";
        String ph2="(90)-123-3344";
       /* System.out.println(ph1);
        ph1 = ph1.replace("-", "");*/
        System.out.println(ph1);
        StringBuffer sb = new StringBuffer();

        /**The code filters out the numbers divisible by 4 (20 and 52), doubles them (40 and 104), and then adds them together (144). The reduce() method starts with an initial value of 0 and applies the Integer::sum function to each element of the stream to compute the final sum of 144.*/
        List<Integer> numbers = Arrays.asList(11, 20, 33, 45, 52);
        int sum = numbers.stream()
                .filter(n -> n % 4 == 0)
                .map(n -> n * 2)
                .reduce(0, Integer::sum);
        System.out.println(sum);
//////=============final variable example -can be modified
        final  int i;
        i=20;
        int j= i+20;
       // i=j+30; //java: variable i might already have been assigned
        System.out.println(i +" == " +j);

    }
}
