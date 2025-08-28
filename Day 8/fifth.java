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
        int sq=(int)Math.sqrt(a);
        if(sq*sq==a){
            System.out.println("Perfect Square");
        }
        else{
            System.out.println("Not");
        }
    }
}