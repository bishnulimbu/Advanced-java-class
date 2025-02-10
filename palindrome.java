class Solution {
  public boolean isPalindrome(int x) {
    int num = 0, rem = 0, y = x;
    while (x > 0) {
      rem = x % 10;
      x = x / 10;
      num = num * 10 + rem;
    }
    if (num == y) {
      return true;
    } else {
      return false;
    }
  }

}

class palindrome {
  public static void main(String[] args) {
    Solution obj1 = new Solution();
    System.out.println(obj1.isPalindrome(11));
  }
}
