import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int flag=0;
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                System.out.print(str.charAt(i));
                flag=1;
            }
        }
        if(flag==0){
            System.out.print("0");
        }
        
    }
}