import java.util.*;

public class fourth {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        Set<Character>set=new HashSet<>();
        String str=sc.nextLine().toLowerCase().trim();
        for(char ch: str.toCharArray()){
            if(set.contains(ch)){
                System.out.println("NOT ISOGRAM");
                return;
            }
            set.add(ch);
        }
        System.out.println("ISOGRAM");
    }
}