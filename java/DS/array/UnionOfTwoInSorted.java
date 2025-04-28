import java.util.ArrayList;
// import java.util.TreeSet;

public class UnionOfTwoInSorted {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int arr2[] = { 2, 3, 4, 4, 5, 11, 12 };
        // TreeSet<Integer> union =new TreeSet<>();
        // for(int i=0;i<arr1.length;i++){
        // union.add(arr1[i]);
        // }
        // for(int i=0;i<arr2.length;i++){
        // union.add(arr2[i]);
        // }
        // System.out.println(union);

        // second approach
        ArrayList<Integer> Union = new ArrayList<>();
        int n = arr1.length;
        int m = arr2.length;
        int i = 0;
        int j = 0;
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                if (Union.size() == 0 || Union.get(Union.size() - 1) != arr1[i]) {
                    Union.add(arr1[i]);
                }
                i++;
            } else {
                if (Union.size() == 0 || Union.get(Union.size() - 1) != arr2[j]) {
                    Union.add(arr2[j]);
                }
                j++;
            }
        }
        while (i < n) {
            if (Union.get(Union.size() - 1) != arr1[i]) {
                Union.add(arr1[i]);
            }
            i++;
        }
        while (j < m) {
            if (Union.get(Union.size() - 1) != arr2[j]) {
                Union.add(arr2[j]);
            }
            j++;
        }
        for (int a : Union) {
            System.out.print(a + " ");
        }
    }
}
