import java.io.*;
import java.util.*;

public class SpyNumber {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int digit=0,sum=0;
        int product=1;
        while(a!=0){
            digit=a%10;
            sum=sum+digit;
            product=product*digit;
            a=a/10;
        }
        
        if(sum==product){
            System.out.println("Spy Number");
        }
        else{
            System.out.println("Not a Spy Number");
        }
    }
}