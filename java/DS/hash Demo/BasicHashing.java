import java.util.*;

public class BasicHashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter an array element:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int hash[] = new int[13];
        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }
        System.out.println("enter the count you want to fetch:");
        int q=sc.nextInt();
        System.out.println("enter the number:");
        while(q>0){
            int number=sc.nextInt();
            System.out.println("the count is: "+hash[number]);
            q--;
        }
        sc.close();
    }
}