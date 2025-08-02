import java.util.*;

public class topkfreq{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int k=sc.nextInt();

        int[] ans=new int[k];

        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->b[1]-a[1]);

        for(int i=0;i<n;i++){
            pq.add(new int[]{arr[i],map.get(arr[i])});
        }

        for(int i=0;i<k;i++){
            ans[i]=pq.poll()[0];
        }
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }

    }
}