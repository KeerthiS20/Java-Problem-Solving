import java.io.*;
import java.util.*;

public class HarshadNumber {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int sum=0;
        int temp=number;
        
        while(number!=0){
            int digit=number%10;
            sum=sum+digit;
            number=number/10;
        }
        
        if(temp % sum ==0){
            System.out.println("Harshad Number");
        }
        else{
            System.out.println("Not Harshad Number");
        }
        
        
    }
}