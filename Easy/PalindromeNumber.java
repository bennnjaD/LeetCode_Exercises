package Easy;

public class PalindromeNumber {
    /*
    Given an integer x, return true if x is palindrome integer.

    An integer is a palindrome when it reads the same backwards
    as forward.

    For example, 121 is palindrome while 123 is not.
     */

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String num = x + "";
        return checkPalindrome(num);
    }

    private boolean checkPalindrome(String num) {
        int left = 0;
        int right = num.length() - 1;
        while (left < right) {
            if (num.charAt(left) != num.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
