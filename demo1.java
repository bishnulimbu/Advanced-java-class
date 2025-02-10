
class Solution {
  public boolean isPalindrome(int x) {
    if (x < 0)
      return false; // negative numbers are not palindromes

    int num = 0, rem = 0, y = x;
    while (x > 0) {
      rem = x % 10; // Get the last digit of x
      x = x / 10; // Remove the last digit from x
      num = num * 10 + rem; // Build the reversed number
    }
    return num == y; // Check if the reversed number is equal to the original number
  }
}
