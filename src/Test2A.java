class Test2A {
  public static void main(String[] args) 
  {
    System.out.println(orderWords("dog","cat","hippo"));
    System.out.println(isLeapYear(2004));
    System.out.println(totalWages(45, 12.50));
  }

  /** Exercise 1
    * Returns the larger of two integer values.
    *
    * @param x The first integer.
    * @param y The second integer.
    * @return The greater of the two numbers.
  */
  public static int max(int x, int y)
  {
    int result = 0;
    if (x > y)
    {
      result = x;
    }
    else if (y > x)
    {
      result = y;
    }
    else if (x == y)
    {
      result = x;
    }
    return result;

  }


  /** Exercise 2
    * Calculates the total wages earned based on hours worked and an hourly rate.
    *
    * @param hours The total number of hours worked. Must be non-negative.
    * @param rate The hourly wage rate. Must be non-negative.
    * @return The total wages earned.
 */
  public static double totalWages(double hours, double rate)
  {
    double wages = 0.0;
    if (hours > 40.0)
    {
      wages = (hours - 40.0) * rate * 1.5 + 40.0 * rate;
    }
    else if (hours < 40.0)
    {
      wages = hours * rate;
    }
    else if (hours == 40.0)
    {
      wages = 40.0 * rate;
    }
    return wages;
  }


/** Exercise 3 
 * Checks if a given year is a leap year according to the Gregorian calendar rules.
 *
 * @param year The year to check (e.g., 2024).
 * @return true if the year is a leap year, false otherwise.
*/
  public static boolean isLeapYear(int year)
  {
     if ((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0))
     {
       return true;
     }
     else
     {
       return false;
     }
  }

  
/** Exercise 4
  * The method returns a single string where the input strings are arranged alphabetically
  *
  **Precondition:** The input values will be entered in all lower-case.
  *
  * @param s1 The first string.
  * @param s2 The second string.
  * @param s3 The third string.
  * @return A single string containing strings concatenated in alphabetical order
 */

  public static String orderWords(String s1, String s2, String s3) {
    String answer = "";
    if (s1.compareTo(s2) < 0) {
      if (s1.compareTo(s3) < 0) {
        if (s2.compareTo(s3) < 0) {
          answer =s1 + ", " + s2 + ", " + s3;
        } else {
          answer =s1 + ", " + s3 + ", " + s3;
        }
      } else {
        answer =s3 + ", " + s1 + ", " + s2;
      }
    } else {
      if (s2.compareTo(s3) < 0) {
        if (s1.compareTo(s3) < 0) {
          answer =s2 + ", " + s1 + ", " + s3;
        } else {
          answer =s2 + ", " + s3 + ", " + s1;
        }
      } else {
        answer =s3 + ", " + s2 + ", " + s1;
      }
    }
    return answer;
  }
}


