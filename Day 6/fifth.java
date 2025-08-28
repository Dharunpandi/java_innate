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
        double d=(Math.sqrt(1 + 24 * n) + 1.0) / 6.0;
        if(d==(int)d){
            System.out.println("Pentagonal Number");
        }
        else{
            System.out.println("Not a Pentagonal Number");
        }
        
        

    }
}