import java.util.Scanner;

/**
 * Finds the sum of 1 to input number
 * @author Thomas Quigley
 */
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // asks the user their number
    System.out.println("Please enter an integer to count down to");
    int userNumber = input.nextInt();

    // declares the sum variable and the number were on
    int sum = 0;
    int numberCounting = 0;

    // adds the number up to the sum
    // stops at the number above the users number
    while (numberCounting != userNumber + 1) {
      // adds to sum
      sum = sum + numberCounting;
      // adds to the next number
      numberCounting = numberCounting + 1;
    }
    // tell them their sum
    System.out.println("The sum from 1 - " + userNumber + " is " + sum);
    
  }
}
