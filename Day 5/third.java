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
        int  val=(int)Math.cbrt(n);
        if(val*val*val==n){
            System.out.println("Perfect Cube");
        }
        else{
            System.out.println("Not a Perfect Cube");
        }
        
    }
}