public class ShellSort {
    public static void shell_sort(int a[], int n) {
        for (int gap = n / 2; gap >= 1; gap = gap / 2) {
            for (int j = gap; j < n; j++) {
                for (int i = j - gap; i >= 0; i = i - gap) {
                    if (a[i + gap] > a[i]) {
                        break;
                    } else {
                        int temp = a[i + gap];
                        a[i + gap] = a[i];
                        a[i] = temp;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 13, 46, 24, 52, 20, 19 };
        int n = arr.length;
        System.out.println("Before Using quick Sort: ");
        for (int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();
        shell_sort(arr, arr.length);
        for (int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
