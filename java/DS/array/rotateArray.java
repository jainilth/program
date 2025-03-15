import java.util.*;
public class rotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rotations");
        int k = sc.nextInt();
        k=k%arr.length;
        rotateByRight(arr, k);
        sc.close();
    }
    public static void rotateByRight(int arr[], int k){
        int n = arr.length;
        reverse(arr, 0, n);
        reverse(arr, 0, k);
        reverse(arr, k, n);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void reverse(int arr[], int start, int e){
        int end = e-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }
}
