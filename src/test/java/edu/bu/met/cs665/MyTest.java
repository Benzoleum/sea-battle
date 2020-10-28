package edu.bu.met.cs665;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

class MyTests {

  @Test
  public void shouldReturnBoardNotNull() {
    Board tester = new Board(); // Board is tested
    assertNotNull(tester.getInitial(), " ");
  }
}
