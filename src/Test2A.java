class Test2A {
  public static void main(String[] args) 
  {
    System.out.println(max(2,6));
    System.out.println(totalWages(42, 1));
    System.out.println(isLeapYear(2004));
    System.out.println(orderWords("c","b","a"));
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
    if(x > y) {
      return x;
    }
    return y;
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
	  double wages;
  
      if (hours > 40){
        wages = 40 * rate + (hours-40) * (rate*1.5);
      }else{
        wages = hours * rate;
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
     if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){
       return true;
     }
     return false;
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

  public static String orderWords(String s1, String s2, String s3)
  {
    if (s1.compareTo(s2) >= 0 && s1.compareTo(s3) >= 0){
      if (s2.compareTo(s3) >= 0){
        return s3 + ", " + s2 + ", " + s1;
      }
      return s2 + ", " + s3 + ", " + s1;
    }else if (s2.compareTo(s1) >= 0 && s2.compareTo(s3) >= 0){
      if (s1.compareTo(s3) >= 0){
        return s3 + ", " + s1 + ", " + s2;
      }
      return s1 + ", " + s3 + ", " + s2;
    }else{
      if (s1.compareTo(s2) >= 0){
        return s2 + ", " + s1 + ", " + s3;
      }
      return s1 + ", " + s2 + ", " + s3;
    }
  }
}


