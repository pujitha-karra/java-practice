import java.util.*;
public class PositiveNegative { 
    public static void main(String[] args){
        Scanner xyz=new Scanner(System.in);
        System.out.println("Enter any num:");
        int num = xyz.nextInt();
        if(num>0){
            System.out.println("num is Positive");
        }
         else if(num<0){
                System.out.println("num is Negative");
            }
            else{
                System.out.println("num is Zero");
            }

        }
    }
    
