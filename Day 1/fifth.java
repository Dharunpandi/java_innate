import java.util.*;

public class fifth {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine().toLowerCase();
        boolean visited[]=new boolean[26];
        for(int i=0;i<str.length();i++){
            if(!Character.isWhitespace(str.charAt(i)) && Character.isLetter(str.charAt(i))){
                char ch=str.charAt(i);
                visited[ch-'a']=true;
            }
        }
        for(int i=0;i<visited.length;i++){
            if(visited[i]==false){
                System.out.println("Not Pangrams");
                return;
            }
        }
        System.out.println("Pangrams");
    }
}