import java.io.*;
import java.util.*;

public class PalindromeNumber {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int rev=0;
        int temp=number;
        if(number<0)number*=-1;
        while(number!=0){
            int digit=number%10;
            rev=(rev*10)+digit;
            number=number/10;
        }
        if(temp == rev){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}