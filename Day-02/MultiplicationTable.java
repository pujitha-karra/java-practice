import java.util.*;
public class MultiplicationTable {
    public static void main(String[] args){
        Scanner ab = new Scanner(System.in);
        int n = 10;
        for(int i = 1; i <= 10; i++){
            int product = n * i;
        System.out.println(n+" * " + i + " = " +product);
    }
}  
}
