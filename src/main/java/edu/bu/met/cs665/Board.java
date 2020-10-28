/**
 * Board class initiates a playing board and implements showBoard method, which shows an initial
 * positions in the board.
 *
 * <p>Assignment 3 Board class
 *
 * @author Nikita Kozino
 * @email kozino@bu.edu
 * @version 1.0
 * @since 2020-03-03
 */
package edu.bu.met.cs665;

public class Board {
  // The following is how initially the board is set up, the initial matrix represents calm sea
  public char[][] initial = {
    {'-', '-', '-', '-', '-'},
    {'-', '-', '-', '-', '-'},
    {'-', '-', '-', '-', '-'},
    {'-', '-', '-', '-', '-'},
    {'-', '-', '-', '-', '-'}
  };

  // The following method prints the initial board
  public void showBoard() {
    for (char[] chars : initial) {
      for (char aChar : chars) { // Nested iterations, which allow the board to print properly
        System.out.print(aChar + " "); // Print the elements in the matrix
      }
      System.out.println();
    }
  }

  public char[][] getInitial() {
    return this.initial;
  }
}
