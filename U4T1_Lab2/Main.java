package U4T1_Lab2;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number that is either positive, even, and a multiple of 7 OR prime:");
    int userNumber = scanner.nextInt();
    while ((userNumber < 0 || userNumber % 7 != 0 || userNumber % 2 != 0) || !isPrime(userNumber)) {
      if (userNumber < 0) {
        System.out.println("Not positive");
      }
      if (userNumber % 7 != 0) {
        System.out.println("Not a multiple of 7");
      }
      if (userNumber % 2 != 0) {
        System.out.println("Not even");
      }
      if (userNumber < 0 || userNumber % 7 != 0 || userNumber % 2 != 0) {
        System.out.print("Try again: ");
        userNumber = scanner.nextInt();
      }
      if (isPrime(userNumber)) {
      System.out.println("Well done, " + userNumber + " is prime!");
      return;
    } else {
      if (userNumber > 0 && userNumber % 7 == 0 && userNumber % 2 == 0) {
        System.out.println("Well done, " + userNumber + " is a positive, even, multiple of 7!");
        return;
      }
    }
    
    }
  }

  /* Returns true if number is prime and false
        if it is not prime; if number is 1, return false */
  private static boolean isPrime(int number) {
    if (number <= 1) {
      return false;
    }

    int currentDivisor = 2; //start at 2 since no need to check 1

    while (currentDivisor < number) {
      if (number % currentDivisor == 0) {
        return false;  // breaks the loop AND exits the method
      }
      currentDivisor++;
    }
    return true;
  }
}
