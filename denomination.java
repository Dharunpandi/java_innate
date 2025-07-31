import java.util.*;
public class denomination{
    public static  void main(String args[]){
        //500 100 50 10 2 1
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        count=n/500;
        System.out.println("500 : "+count);
        n=n%500;
        count=n/100;
        System.out.println("100 : "+count);
        n=n%100;
        count=n/50;
        System.out.println("50 : "+count);
        n=n%50;
        count=n/10;
        System.out.println("10 : "+count);
        n=n%10;
        count=n/2;
        System.out.println("2:  "+count);
        n=n%2;
        count=n/1;
        System.out.println("1 : "+count);
    }
}