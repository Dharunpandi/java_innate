import java.util.*;

public class third {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] arr=str.split("\\s+");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]);
            if(i!=0){
                System.out.print(" ");
            }
           
        }
    }
}