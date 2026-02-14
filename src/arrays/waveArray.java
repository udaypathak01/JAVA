package arrays;

public class waveArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 8, 9, 10};
        int i = 0;

        while (i < arr.length-1) {
            if (i==arr.length)return;
           int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i+1] = temp;
            i += 2;
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}
