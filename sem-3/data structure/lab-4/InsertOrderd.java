import java.util.*;

public class InsertOrderd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 1, 3, 6, 8, 10 };
        int n = arr.length;
        int x=0;
        System.out.println("plese enter a number you want to add");
        int c=sc.nextInt();
        int[] arr2 = new int[n + 1];
        for(int i=0;i<n;i++){
            if(arr[i]<c){
                arr2[i]=arr[i];
                x++;
            }
            else{
                break;
            }
        }
        arr2[x]=c;
        for(int i=x;i<n;i++){
            arr2[i+1]=arr[i];
        }
        for(int i=0;i<n+1;i++){
            System.out.print(arr2[i]+" ");
        }
    }
}
