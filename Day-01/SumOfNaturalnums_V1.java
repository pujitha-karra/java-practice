import java.util.*;
public class SumOfNaturalnums {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num :");
        int n = sc.nextInt();
         int sum = n*(n+1)/2;
        System.out.println("sum of first natural nums : " + sum);
    }
    
} 
