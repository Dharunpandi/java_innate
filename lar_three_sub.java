
public class lar_three_sub{
    public static void main(String args[]){
        int [] arr={2,7,1,9,3,2,10,11};
        int k=3;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int maxi=sum;
        int start=0;
        int end=start+k-1;
        for(int i=k;i<arr.length;i++){
            sum+=arr[i]-arr[i-k];
            if(maxi<sum){
                maxi=sum;
                start=i-k+1;
                end=start+k-1;
            }

        }
        System.out.println(maxi);
        System.out.println(start);
        System.out.println(end);

    }
}
/*
 2-0
 7-1
 1-2
 9-3

 3 -0 = 3-3=0
 4 - 1 = 4-3=1
 5- 2   5-3=2

 */