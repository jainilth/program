public class moveZeroToEnd {
    public static void main(String[] args) {
        int a[]={1,0,2,3,2,0,0,4,5,1};
        int j=-1;
        for(int i=0;i<a.length;i++){
            if(a[i]==0){
                j=i;
                break;
            }
        }
        for(int i=j+1;i<a.length;i++){
            if(a[i]!=0){
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
                j++; 
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
