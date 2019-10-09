
import java.util.Scanner;

public class D6
{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("D6");
        System.out.println("---------------------------------");
        System.out.println("");
        boolean rollAgain = true;
        while (rollAgain) {
            System.out.println("How many D6's would you like to roll?");
            int rollNum = sc.nextInt();
            int total = 0;
            System.out.print("Your rolls are: ");
            for (int i = 0; i < rollNum; i ++) {
                int roll = (int) (6*Math.random() +1);
                System.out.print(roll +" ");
                rollAgain = false;
                total = total + roll;
                if (i == (rollNum - 1)){
                    System.out.println("Total: " + total);
                }
            }
            System.out.println("");
            System.out.println("Roll again? y/n");
            String ans = sc.next();
            if ("y".equals(ans)){
                rollAgain = true;
            } else if ("n".equals(ans)){
                rollAgain = false;
                System.out.print("Goodbye!");
            }
        }
    }
}

