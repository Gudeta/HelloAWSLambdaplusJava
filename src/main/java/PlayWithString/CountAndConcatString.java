package PlayWithString;

import java.util.Scanner;
/**
 Sample Input 0

 hello
 java
 Sample Output 0

 9
 No
 Hello Java
 */
public class CountAndConcatString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int count=A.length()+B.length();
        System.out.println(count);
        char c=A.charAt(0);
        char cc=B.charAt(0);
        if(c>cc){
            System.out.println("Yes");
        }System.out.println("NO");
        String s1=A.substring(0,1).toUpperCase() + A.substring(1);
        String s2=B.substring(0,1).toUpperCase() + B.substring(1);
        System.out.println(s1+" "+s2);

    }
}
