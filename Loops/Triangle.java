
import java.util.Scanner;

public class Triangle
{
  public static void main (String[] args) {
      
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Triangle");
      System.out.println("");
      System.out.println("-----------------------------------");
      
      System.out.println("What character do you want your triangle made of?");
      String character = sc.nextLine();
      System.out.println("How tall do you want your triangle?");
      int height = sc.nextInt();
      System.out.println("Here's your triangle!");
      for (int i = 0; i < height; i ++) {

          for (int j = 0; j < i; j ++) {
              System.out.print(character);
            }
            
        }
  
      
      
    }
}
