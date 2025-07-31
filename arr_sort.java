
public class arr_sort{
    public static void main(String args[]){
        int[] arr={1,1,1,3,4,5,6};
        int n=arr.length;
        int flag=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>=arr[i-1]){
                continue;
            }
            else{
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}