import java.util.*;
public class Binery {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]={1,2,4,6,7,10,13,24,78};
        int n=sc.nextInt();
        int min=0;
        int max=a.length-1;
        boolean t=false;
        while (min<max) {
            int mid=(min+max)/2;
            if(a[mid]==n){
                System.out.println("the number is available at "+(mid+1)+" position");            
                t=true;
                break;
            }
            else if(a[mid]<n){
                min=mid+1;
            }
            else{
                max=mid-1;
            }
        }
        if(!t){
            System.out.println("element is not present");
        }
    }
}
