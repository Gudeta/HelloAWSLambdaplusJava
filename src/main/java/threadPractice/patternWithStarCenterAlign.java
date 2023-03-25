package threadPractice;

import java.util.Scanner;

public class patternWithStarCenterAlign {
    public static void main(String[] args) {
        int i,j,n;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number");
        n=scanner.nextInt();
        {
            System.out.println("\n Center Align");
            for (i=1;i<=n;i++){
                for (j=n-1; j>=1;j--){
                    System.out.println(" ");
                }
                for (j=1;j<=i;j++){
                    System.out.println("* ");
                }
                System.out.println("\n");
            }
        }
    }
}
