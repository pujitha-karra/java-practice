import java.util.*;
public class CountDigits {
    public static void main(String[] args){
        Scanner xy = new Scanner(System.in);
        System.out.println("Enter a num :");
        int n = xy.nextInt();
        int count = 0;
        while(n!=0)
        {
             n = n/10;
             count++;
        }
        System.out.println("counting the digits are : " +count);
        }
    
}
