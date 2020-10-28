/**
 * Assignment 3 Main class.
 *
 * @author Nikita Kozino
 * @email kozino@bu.edu
 * @version 1.0
 * @since 2020-03-03
 */
package edu.bu.met.cs665;

public class Main {

  public static void main(String[] args) {
    Board n = new Board();
    Player p = new Player();
    Shoot shoot = Shoot.getInstance();
    n.showBoard();
    p.placeShip();
    shoot.playerShoot();
    n.getInitial();
  }
}
