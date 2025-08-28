import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine().trim();
        String vow="AEIOUaeiou";
        Set<Character>set=new HashSet<>();
        for(char c: vow.toCharArray()){
            set.add(c);
        }
        
        StringBuilder sb=new StringBuilder();
        
        for(int i=0;i<str.length();i++){
            if(set.contains(str.charAt(i))){
                sb.append(" ");
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb);
    }
}