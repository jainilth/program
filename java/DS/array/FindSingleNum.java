public class FindSingleNum {
    public static void main(String[] args) {
        // brute froce approach
        int[] arr = { 4, 1, 2, 3, 1, 2, 4 };
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            int number = arr[i];
            for (int j = 0; j < arr.length; j++) {
                if (number == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(number);
            }
        }
    }
}
