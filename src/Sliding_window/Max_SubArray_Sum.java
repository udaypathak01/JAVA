package Sliding_window;

import java.util.*;

public class Max_SubArray_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        System.out.println("Enter the size of Window: ");
        int k = sc.nextInt();
        System.out.println("Enter the array elements: ");

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max_sum = max_subArray_sum(arr, n, k);
        System.out.println("Here is the maximum sum: " + max_sum);
    }

    public static int max_subArray_sum(int[] arr, int n, int k) {
        int i = 0, j = 0, sum = 0, max_sum = Integer.MIN_VALUE;
        int idx=0,idx2=0;
        while(j<arr.length){
            int window = j-i + 1;
            sum+=arr[j];
            if (window<k){
                j++;
            }else if(window==k){
                max_sum=Math.max(sum,max_sum);
                if(sum>max_sum){
                    idx=i;
                    idx2=j;
                }
                sum-=arr[i];
                i++;
                j++;
            }
        }

        return max_sum;
    }
}
