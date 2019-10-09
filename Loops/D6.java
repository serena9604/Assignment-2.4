
import java.util.Scanner;

public class D6
{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("D6");
        System.out.println("---------------------------------");
        System.out.println("");
        System.out.println("How many D6's would you like to roll?");
        int rollNum = sc.nextInt();
        for (int i = 0; i < rollNum; i ++) {
            int roll = (int) (6*Math.random() +1);
        }
    }
}

