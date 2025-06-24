import java.util.Scanner;

public class palindrome {
    public static void isPalindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                System.out.println(s + " is not a palindrome");
                return;
            }
        }
        System.out.println(s + " is a palindrome");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        isPalindrome(s);
        sc.close();
    }
}