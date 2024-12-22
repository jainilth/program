import java.util.*;

public class removeDuplicate {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 2, 2, 3, 3, 4 };

        // approach 1
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length-1;j++){
        //         if(nums[i]==nums[j]){
        //             nums[j]=nums[j+1];
        //             nums[j+1]=0;
        //         }
        //         j++;
        //         if(nums[j]==0){
        //             for(int k=j;k<nums.length-1;k++){
        //                 nums[k]=nums[k+1];
        //             }
        //         }
        //     }
        // }
        // for(int i=0;i<nums.length-1;i++){
        //     if(nums[i]==nums[i+1]){
        //         for(int j=i+1;j<nums.length-1;j++){
        //             nums[j]=0;
        //         }
        //     }
        // }

        // approach 2
        Set<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            hashSet.add(nums[i]);
        }
        int a=0;
        for(int i:hashSet){
            nums[a]=i;
            a++;
        }
        for(int i=a;i<nums.length;i++){
            nums[i]=0;
        }
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]+" ");
        }

        // leetcode approach
        // class Solution {
        //     public int removeDuplicates(int[] nums) {
        //         int j = 1;
        //         for (int i = 1; i < nums.length; i++) {
        //             if (nums[i] != nums[i - 1]) {
        //                 nums[j] = nums[i];
        //                 j++;
        //             }
        //         }
        //         return j;
        //     }
        // }
    }
}