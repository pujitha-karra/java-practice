import java.util.*;
public class CheckGreaternum {
    public static void main(String[] args){
        Scanner abc=new Scanner(System.in);
        System.out.println("Enter the 1st num :");
        int num1 =abc.nextInt() ;
        System.out.println("Enter the 2nd num :");
        int num2 = abc.nextInt();
        if(num1>num2){
            System.out.println("num1 is greater.");
        }
        else if(num1<num2) {
            System.out.println("num2 is greater.");
        }
        else{
            System.out.println("Both are equal.");
        }
    }
    }

