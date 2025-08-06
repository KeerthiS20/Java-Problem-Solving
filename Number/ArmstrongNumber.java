import java.io.*;
import java.util.*;

public class ArmstrongNumber {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int temp=number;
        int count=0;
        double sum=0;
        
        int temp2=number;
        while(temp2!=0){
            count++;
            temp2=temp2/10;
        }
        
        temp2=number;
        for(int i=1;i<=count;i++){
            int digit=temp2%10;
            sum=sum+(Math.pow(digit,count));
            temp2=temp2/10;
            
        }
        
        if(temp==(int)sum){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        
    }
}