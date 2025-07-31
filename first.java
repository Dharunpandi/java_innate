import java.util.*;

public class first{
    public static void main(String args[]){
        int[] nums={6,1,1,1,1,10};
        int n=nums.length;
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        int leftsum=0;
        int flag=0;
        for(int i=0;i<n;i++){
            leftsum+=nums[i];
            sum-=nums[i];
            if(leftsum==sum){
                System.out.println(i);
                flag=1;
            }
        }
        if(flag==0){
            System.out.println(-1);
        }
        
    }
}