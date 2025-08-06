import java.io.*;
import java.util.*;

public class NumberPyramid {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=0;i<n;i++){
            int space=n-i-1;
            for(int j=0;j<space;j++){
                System.out.print(" ");
            }
            int star=i+1;
            for(int k=0;k<star;k++){
                
                    System.out.print(k+1+" ");
                
                
            }
            System.out.println();
        }
    }
}