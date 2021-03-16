// Recursive call- Palindrome string
public class PalindromeString {
        static boolean isPalindrome(String str,
                                int beg, int end)
        {
            // String with 1 char
            if (beg == end)
                return true;

            // If first and last char doesnt match
            if ((str.charAt(beg)) != (str.charAt(end)))
                return false;

            // If there are more than 2 chars, check middle substring is pal ?
            if (beg < end + 1)
                return isPalindrome(str, beg + 1, end - 1);
            return true;
        }

        static boolean isPalindrome(String str)
        {
            int n = str.length();
            if (n == 0)
                return true;

            return isPalindrome(str, 0, n - 1);
        }
        public static void main(String args[])
        {
            String str = "peep";

            if (isPalindrome(str))
                System.out.println("Palindrome");
            else
                System.out.println("Not Palindrome");
        }
    }

