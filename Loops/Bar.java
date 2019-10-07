
import java.util.Scanner;

public class Bar
{
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);  

        System.out.println("Bar");
        System.out.println("");
        System.out.println("---------------------------------");
        
        System.out.println("What character do you want your bar made of?");
        String character = sc.nextLine();
        System.out.println("How long do you want your bar?");
        int length = sc.nextInt();
        System.out.println("Here's your bar!");
        int i = 0;
        while (i < length) {
            System.out.print(character);
            i ++;
        }

    }

}
