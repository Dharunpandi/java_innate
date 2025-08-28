import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        for(long i=2;i<=n;i++){
            if(n%i==0 && isPrime(i)){
                System.out.println(i);
                break;
            }
        }
        
    }
    private static boolean isPrime(long n){
        long i=2;
        int flag=0;
        for(i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                flag=1;
            }
        }
        if(flag==1){
            return false;
        }
        else{
            return true;
        }
    }
}