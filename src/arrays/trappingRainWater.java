package arrays;

public class trappingRainWater {
    //array prefix and suffix approach
    public static int trap(int[] arr) {
        int n = arr.length;
        int[] lmax = new int[n];
        int[] rmax = new int[n];
        int left = arr[0];
        int right = arr[n - 1];
        for (int i = 0; i < n; i++) {
            if (left < arr[i]) left = arr[i];
            lmax[i] = left;
        }
        for (int i = n - 1; i >= 0; i--) {
            if (right < arr[i]) right = arr[i];
            rmax[i] = right;
        }
        int water = 0;
        for (int i = 0; i < n; i++) {
            water += Math.min(lmax[i], rmax[i]) - arr[i];
        }
        return water;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int temp = trap(arr);
        System.out.println(temp);
    }
}
