public class MergeArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8, 10};
        int l=arr1.length+arr2.length;
        int[] result = new int[l];
        for(int i=0;i<l;i++){
            if(i<arr1.length){
                result[i]=arr1[i];
            }
            else{
                result[i]=arr2[i-arr1.length];
            }
        }
        for(int i=0;i<l;i++){
            System.out.print(result[i]+" ");
        }
    }
}
