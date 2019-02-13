package edu.csc413.calculator.evaluator;
import java.util.Stack;

/**
 * Operand class used to represent an operand
 * in a valid mathematical expression.
 */

public class Operand {

  Stack<Integer> stateStack = new Stack<>();

  /**
  * construct operand from string token.
  */  
  public Operand( String token ) {

      stateStack.push(Integer.parseInt(token));

  }

  /**
   * construct operand from integer
   */
  public Operand( int value ) {

      stateStack.push(value);

  }

  /**
   * return value of opernad
   */
  public int getValue() {

      if (stateStack.peek() != null)
      {
        return stateStack.pop();
      }

    return 0;
  }

  /**
   * Check to see if given token is a valid
   * operand.
   */
  public static boolean check( String token ) {

      //I hate using this try/catch block to test if the token
      //is valid but it is the easiest way I could think of
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
