public class ArrayData {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 3, 5 };
        System.out.println(sum(arr));
        System.out.println(min(arr));
        System.out.println(max(arr));
        System.out.println(avg(arr));
    }

    static int sum(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        return sum;
    }

    public static int min(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        int minValue = arr[0];
        for (int num : arr) {
            minValue = Math.min(minValue, num);
        }
        return minValue;
    }

    public static int max(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        int maxValue = arr[0];
        for (int num : arr) {
            maxValue = Math.max(maxValue, num);
        }
        return maxValue;
    }

    public static double avg(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        int total = sum(arr);
        return (double) total / arr.length;
    }
}