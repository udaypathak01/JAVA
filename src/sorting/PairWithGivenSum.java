package sorting;
import java.util.Arrays;

public class PairWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {1, -2, 1, 0, 5};
        boolean x = twoSum(arr, 0);
        System.out.println(x);
    }

    public static boolean twoSum(int arr[], int target) {
        Arrays.sort(arr);
        int i = 0, j = arr.length - 1;
        while (i < j) {
            if (arr[i] + arr[j] == target) {
                return true;
            } else if (arr[i] + arr[j] > target) {
                j--;
            } else if (arr[i] + arr[j] < target) {
                i++;
            }
        }
        return false;
    }
}
