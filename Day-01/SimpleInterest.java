import java.util.*;
public class SimpleInterest {
    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the priciple interest : ");
        float P = sc.nextFloat();
        System.out.println("Enter Rate on interst : ");
        float R = sc.nextFloat();
        System.out.println("Enter time");
        float T = sc.nextFloat();
        float SI = (P * R * T);
        System.out.println("simple interest is : " + SI);
    }
    
}
