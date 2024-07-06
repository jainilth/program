import java.util.*;
public class deletinsorted {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int a[]={2,3,5,7,9,13};
        int b[]=new int [6];
        int index=0;
        int c=0;
        for(int i=0;i<6;i++){
            if(a[i]==num){
                b[i]=a[i+1];
                c++;
                index=i+1;
                break;
            }
            else
            b[i]=a[i];
        }
        if(c==0){
            System.out.println("element not found in array");
            return;
        }
        for(int i=index;i<5;i++)
        b[i]=a[i+1];
        for(int i=0;i<5;i++)
        System.out.print(b[i]+" ");
    }
}
