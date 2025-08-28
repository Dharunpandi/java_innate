import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int min,max;
        if(a>b){
            min=a;
            max=b;
        }
        else{
            max=a;
            min=b;
        }
        int i=min;
        for(i=min;i>=1;i--){
            if(a%i==0 && b%i==0){
                break;
            }
        }
        System.out.println("GCD of two number is "+i);
    }
}