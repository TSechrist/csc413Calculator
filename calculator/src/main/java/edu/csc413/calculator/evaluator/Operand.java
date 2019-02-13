package edu.csc413.calculator.evaluator;

/**
 * Operand class used to represent an operand
 * in a valid mathematical expression.
 */

public class Operand {

    //I started off using a vector for the datafield but
    //I noticed that a regular int does the job fine.

    int state = 0;

  /**
  * construct operand from string token.
  */  
  public Operand( String token ) {

        state = Integer.parseInt(token);

  }

  /**
   * construct operand from integer
   */
  public Operand( int value ) {

        state = value;

  }

  /**
   * return value of opernad
   */
  public int getValue() {

      return state;

  }

  /**
   * Check to see if given token is a valid
   * operand.
   */
  public static boolean check( String token ) {

      //I hate using this try/catch block to test if the token
      //is valid but it is the easiest way I could think of.
      //Found this on stackoverflow
      try
      {
          int validInt = Integer.parseInt(token);
          return true;
      }
      catch (NumberFormatException e)
      {
          return false;
      }

  }
}
