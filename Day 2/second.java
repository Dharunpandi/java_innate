import java.util.*;

public class second {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        if(str1.equals(str2)){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }
    }
}