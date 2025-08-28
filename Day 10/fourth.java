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
        
        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            int team1=0;
            int team2=0;
            int count=0;
            for(int j=1;j<=num;j++){
                
                if(num%j==0){
                    if(j%2==0){
                        team2++;
                    }
                    else{
                      team1++;
                    }
                }
            }
            if(team1==team2){
                System.out.println("1");
            }
            else{
                System.out.println("0");
            }
        }
    }
}