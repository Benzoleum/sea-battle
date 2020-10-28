package edu.bu.met.cs665;

import java.util.Scanner;

public class Player {

  public static int[][] matrix1 = new int[5][5]; // Create a 5 X 5 matrix, initially empty
  public static int[][] matrix2 = new int[5][5]; // Create a 5 X 5 matrix, initially empty

  public void placeShip() {
    place(
        "Player 1, please input x coordinate for the first ship: ",
        "Player 1, please input y coordinate for the first ship: ",
        matrix1,
        "Player 1, please input x coordinate for the second ship: ",
        "Player 1, please input y coordinate for the second ship: ",
        "Player 1, please input x coordinate for the third ship: ",
        "Player 1, please input y coordinate for the third ship: ");
    place(
        "Player 2, please input x coordinate for the first ship: ",
        "Player 2, please input y coordinate for the first ship: ",
        matrix2,
        "Player 2, please input x coordinate for the second ship: ",
        "Player 2, please input y coordinate for the second ship: ",
        "Player 2, please input x coordinate for the third ship: ",
        "Player 2, please input y coordinate for the third ship: ");
  }

  private void place(
      String s, String s2, int[][] matrix2, String s3, String s4, String s5, String s6) {
    // Try block to catch an exception that might be thrown if the input is out of bounds
    try {
      Scanner ship1X = new Scanner(System.in); // Initiates user input prompt
      System.out.println(s);
      int ship1PlaceX = ship1X.nextInt();
      Scanner ship1Y = new Scanner(System.in); // Initiates user input prompt
      System.out.println(s2);
      int ship1PlaceY = ship1Y.nextInt();
      matrix2[ship1PlaceX][ship1PlaceY] =
          1; // add the ship to the matrix, 1 if the ship is in the cell, otherwise 0
      Scanner ship2X = new Scanner(System.in); // Initiates user input prompt
      System.out.println(s3);
      int ship2PlaceX = ship2X.nextInt();
      Scanner ship2Y = new Scanner(System.in); // Initiates user input prompt
      System.out.println(s4);
      int ship2PlaceY = ship2Y.nextInt();
      matrix2[ship2PlaceX][ship2PlaceY] = 1;
      Scanner ship3X = new Scanner(System.in); // Initiates user input prompt
      System.out.println(s5);
      int ship3PlaceX = ship3X.nextInt();
      Scanner ship3Y = new Scanner(System.in); // Initiates user input prompt
      System.out.println(s6);
      int ship3PlaceY = ship3Y.nextInt();
      matrix2[ship3PlaceX][ship3PlaceY] = 1;
    } catch (Exception e) { // Catches the exception if thrown
      System.out.println("Please place your ships on the game board");
      placeShip();
    }
  }

  public int[][] getMatrix1() {
    return matrix1;
  }

  public int[][] getMatrix2() {
    return matrix2;
  }
}
