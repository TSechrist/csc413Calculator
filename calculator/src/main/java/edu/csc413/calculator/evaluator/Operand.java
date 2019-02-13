package edu.csc413.calculator.evaluator;
import java.util.Vector;

/**
 * Operand class used to represent an operand
 * in a valid mathematical expression.
 */

public class Operand {

    Vector<Integer> vState = new Vector<>();

  /**
  * construct operand from string token.
  */  
  public Operand( String token ) {

        vState.add(Integer.parseInt(token));

  }

  /**
   * construct operand from integer
   */
  public Operand( int value ) {

        vState.add(value);
  }

  /**
   * return value of opernad
   */
  public int getValue() {

        if (vState.firstElement() != null)
        {
            return vState.firstElement();
        }

         return 0;
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
