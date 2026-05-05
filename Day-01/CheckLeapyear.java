import java.util.*;
public class CheckLeapyear {
    public static void main(String[] args){
Scanner abc = new Scanner(System.in);
System.out.println("Enter a year");
int year = abc.nextInt();
if(year%4==0){
    System.out.println("year is LeapYear.");
}
else{
    System.out.println("not LeapYear.");
}
    }

    
}
