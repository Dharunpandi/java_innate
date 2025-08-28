import java.util.*;

public class first{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine().trim();
        int count=0;
        for(char ch:str.toCharArray()){
            if(ch=='('){
                count++;
            }
            if(ch==')'){
                count--;
                if(count<0){
                    System.out.println("Unbalanced");
                    return;
                }
            }
        }
        if(count==0){
            System.out.println("Balanced");
        }
        else{
            System.out.println("Unbalanced");
        }
    }
}