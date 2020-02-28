//Scan all primitive data types
import java.util.Scanner;

public class FootBoardDim {
  /**
  * This is a dice roll guessing game. It now uses a function to return the value.
  * @author Michias Shiferaw
  * @Version 2.0
  * @since 2020-02-27
  */
  public static double footBoardDim(double width, double height) {
    //Gets two dimensions of a board and returns what the 
    // third one would be in order for it to be a Board Foot
    height = 144 / (width * height);
    return height;
  }

  /**
  * This is a dice roll guessing game. It now uses a function to return the value.
  * @author Michias Shiferaw
  * @Version 2.0
  * @since 2020-02-27
  */

  public static void main(String[] args) {

    Scanner userInput = new Scanner(System.in);
    double length;
    
    
    System.out.println("Enter the length of the board foot (inches):");
    length = userInput.nextDouble();
    double width;
    
    width = 0.0;
    System.out.println("Enter the width of the board foot (inches):");
    width = userInput.nextDouble();

    //This insures that the length and width are not negative
    if (length <= 0.0 || width <= 0) {

      //If the if statement is true then exit the program
      System.out.print("Invalid input! ");
      System.exit(0);
    }

    System.out.println("(In inches) the final dimension is ");
    System.out.print(footBoardDim(length, width));
  }
}