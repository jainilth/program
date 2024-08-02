import java.util.*;
public class Linear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]={1,3,5,9,6,25,10};
        int b=sc.nextInt();
        boolean f=false;
        for(int i=0;i<a.length;i++){
            if(a[i]==b){
                System.out.println("the number is available at "+(i+1)+"position");
                f=true;
                break;
            }
        }
        if(!f){
            System.out.println("there is no element present in array");
        }
    }
}
