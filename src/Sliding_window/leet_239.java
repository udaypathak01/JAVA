package Sliding_window;

import java.util.ArrayList;

public class leet_239 {
    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        maxSlidingWindow(nums, k);
    }

    public static void maxSlidingWindow(int[] nums, int k) {
        int i = 0, j = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        int max=Integer.MIN_VALUE;
        while(j<nums.length){
            int ws=j-i+1;
            if(nums[j]>max){
                max=nums[j];
            }
            if(ws<k){
                j++;
            }else if(ws==k){
                arr.add(max);
                i++;
                j++;
            }

        }
        int[] brr = new int[arr.size()];

        for (int l = 0; l < arr.size(); l++) {
            brr[i] = arr.get(i);
        }
    }


    public static void maxSlidingWindowBrute(int[] nums, int k) {
        //        brute force
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            if ((i + k) > nums.length) {
                break;
            }
            for (int j = i; j < i + k; j++) {
                if ((i + k) > nums.length) {
                    break;
                }
                if (nums[j] > temp) {
                    temp = nums[j];
                }
            }

            arr.add(temp);

        }
        int[] brr = new int[arr.size()];

        for (int i = 0; i < arr.size(); i++) {
            brr[i] = arr.get(i);
        }
    }
}
