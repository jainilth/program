public class heapSort {
    static void heap_sort(int arr[]){
        int n=arr.length;
        for(int i=(n-1)/2;i>0;i--){
            heapify(arr,n,i);
        }
        for(int i=n-1;i>0;i--){
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            heapify(arr,i,0);
        }
    }
    static void heapify(int arr[], int N, int i)
    {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < N && arr[l] > arr[largest])
            largest = l;

        if (r < N && arr[r] > arr[largest])
            largest = r;

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, N, largest);
        }
    }
    public static void main(String[] args) {
        int arr[] = { 13, 46, 24, 52, 20, 19 };
        int n = arr.length;
        System.out.println("Before Using heap Sort: ");
        for (int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();
        heap_sort(arr);
        for (int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
