/**
 * Shoot class implements playerShoot() method which allows players to shoot their battleships
 *
 * <p>Assignment 3 Shoot class
 *
 * @author Nikita Kozino
 * @email kozino@bu.edu
 * @version 1.0
 * @since 2020-03-03
 */
package edu.bu.met.cs665;
// Import necessary modules
import java.util.Scanner;

public class Shoot {

  // Implement Singleton Pattern
  private static Shoot obj;
  // Create objects for necessary classes
  Player p = new Player();
  int[][] matrix11 = p.getMatrix1();
  int[][] matrix22 = p.getMatrix2();
  int hit1 = 0;
  int hit2 = 0;
  boolean endNot = true; // Declare endNot boolean to allow while loop to run properly
  Board b = new Board();
  Board с = new Board();
  char[][] h1 = b.getInitial();
  char[][] h2 = с.getInitial();
  private Shoot() {}

  public static Shoot getInstance() {
    if (obj == null) obj = new Shoot();
    return obj;
  }

  // Declare method that allows player to shoot
  public void playerShoot() {
    while (endNot) { // While loop untill some player sinks all 3 ships
      try { // Try block to catch an exception that might be thrown if the shot is out of bounds
        new ShotPlace().invoke1();
        new ShotPlace().invoke2();
      } catch (Exception e) {
        System.out.println("Please use the board dimensions for shots");
        playerShoot();
      }
    }
  }

  private class ShotPlace {

    public void invoke1() {
      Scanner p1Shot1X = new Scanner(System.in);
      System.out.println("Player 1, please input x coordinate for the shot: ");
      int p1Shot1XPos = p1Shot1X.nextInt(); // Shot by player 1, on X axis
      Scanner p1Shot1Y = new Scanner(System.in);
      System.out.println("Player 1, please input y coordinate for the shot: ");
      int p1Shot1YPos = p1Shot1Y.nextInt(); // // Shot by player 1, on Y axis
      if (matrix22[p1Shot1XPos][p1Shot1YPos]
          == 0) { // If loop for the shot that lands at position where element = 0 (no ship)
        System.out.println("Player 1: You missed");
        h1[p1Shot1XPos][p1Shot1YPos] =
            '*'; // Change initial board element from - to *, to indicate a shot landed
        // Print the board
        for (char[] chars : h1) {
          for (char aChar : chars) {
            System.out.print(aChar + " ");
          }
          System.out.println();
        }
      } else {
        System.out.println("Player 1: It's a hit!");
        matrix22[p1Shot1XPos][p1Shot1YPos] =
            2; // If the shot sinks the ship, change 1 to 2, indicating a sinked ship
        h1[p1Shot1XPos][p1Shot1YPos] =
            'X'; // Change initial board element from - to X, to indicate a sinked ship
        hit1 += 1; // Increment hit1 that indicates player 1 score
        // Print board
        for (char[] chars : h1) {
          for (char aChar : chars) {
            System.out.print(aChar + " ");
          }
          System.out.println();
        }
      }
    }

    public void invoke2() {
      Scanner p2Shot2X = new Scanner(System.in);
      System.out.println("Player 2, please input x coordinate for the shot: ");
      int p2Shot2XPos = p2Shot2X.nextInt(); // Shot by playr 2, on X axis
      Scanner p2Shot2Y = new Scanner(System.in);
      System.out.println("Player 2, please input y coordinate for the shot: ");
      int p2Shot2YPos = p2Shot2Y.nextInt(); // Shot by player 2, on Y axis
      if (matrix11[p2Shot2XPos][p2Shot2YPos]
          == 0) { // If loop for the shot that lands at position where element = 0 (no ship)
        System.out.println("Player 2: You missed");
        h2[p2Shot2XPos][p2Shot2YPos] =
            '*'; // Change initial board element from - to *, to indicate a shot landed
        // Print board
        for (char[] chars : h2) {
          for (char aChar : chars) {
            System.out.print(aChar + " ");
          }
          System.out.println();
        }
      } else {
        System.out.println("Player 2: It's a hit!");
        matrix11[p2Shot2XPos][p2Shot2YPos] =
            2; // If the shot sinks the ship, change 1 to 2, indicating a sinked ship
        h2[p2Shot2XPos][p2Shot2YPos] =
            'X'; // Change initial board element from - to X, to indicate a sinked ship
        hit2 += 1; // Increment hit2 that indicates player 2 score
        // Print board
        for (char[] chars : h2) {
          for (char aChar : chars) {
            System.out.print(aChar + " ");
          }
          System.out.println();
        }
      }
      // If statement to check if either player sinked all of the ships
      if (hit2 == 3 || hit1 == 3) {
        endNot = false; // make endNot false to break the while loop
      }
      // If statement to print the player who wins
      if (hit1 == 3) {
        System.out.println("Player 1 wins");
      } else if (hit2 == 3) {
        System.out.println("Player 2 wins");
      }
    }
  }
}
