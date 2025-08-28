import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            if(n%i==0 && isPrime(i)){
                System.out.println(i);
                return;
            }
        }
    }
    private static boolean isPrime(int n){
        int flag=0;
        for(int i=2;i<Math.sqrt(n);i++){
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