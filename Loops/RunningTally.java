
import java.util.Scanner;

public class RunningTally
{
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("RunningTally");
        System.out.println("");
        System.out.println("Let's add some numbers! [Type a negative number to quit]");
       System.out.println("---------------------------------");
         
        int i = sc.nextInt();
        int total = 0;
        boolean add = true;
        while (i >= 0 && add == true) {
            System.out.println("Add: " + i);
            total = total + i;
            i = sc.nextInt();
        }
        if (i < 0) {
            System.out.print("Total: " + total);
        }
        
        

    }
}

/*
 * 
 * 
 * 
 * 
 * 
 * 
 */
