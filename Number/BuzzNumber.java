import java.io.*;
import java.util.*;

public class BuzzNumber {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        if(number % 7 == 0 || number%10 == 7){
            System.out.println("Buzz Number");
        }
        else{
            System.out.println("Not Buzz Number");
        }
    }
}