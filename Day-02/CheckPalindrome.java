import java.util.*;
public class CheckPalindrome
  {
    public static void main(String[ ] args)
  {
        Scanner yz = new Scanner(System.in);
        System.out.println("ENter a number:");
        int n = yz.nextInt();
        int original = n;
        int rev = 0;
        while(n!=0)
        {
            int digit = n%10;
            rev = rev * 10 + digit;
            n = n/10;
        }
        if(rev==original)
        {
            System.out.println("num is palindrome. ");
        }
        else
        {
            System.out.println("num is not palindrome.");
        }
    }
}
