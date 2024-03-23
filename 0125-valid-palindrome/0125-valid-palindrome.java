// Assuming you've verified your environment and Java version is compatible

import java.lang.Character;

class Solution {
  public boolean isPalindrome(String s) {
      int left = 0;
      int right = s.length() - 1;
      while (left < right) { // Use left < right to avoid infinite loop

          // Skip non-alphanumeric characters on the left side
          while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
              left++;
          }

          // Skip non-alphanumeric characters on the right side
          while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
              right--;
          }

          if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
              return false;
          }
          left++;
          right--; 
      }
      return true;
  }
}
