import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        HashMap<Integer,Integer>map=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            int val=sc.nextInt();
            arr[i]=val;
            if(map.containsKey(val)){
                int ele=map.get(val);
                map.put(val,ele+1);
            }
            else{
                map.put(val,1);
            }
            
        }
        int flag=1;
        for(int i=0;i<n;i++){
            if(map.get(arr[i])==1){
                System.out.print(arr[i]+" ");
                flag=0;
            }
        }
        if(flag==1){
            System.out.println("No unique elements in the array");
        }
    
    }
}