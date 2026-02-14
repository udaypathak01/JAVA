package arrays;

public class segrate0sAnd1s {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 0};
        int zero = 0;
        int one = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zero++;
            } else if (arr[i] == 1) {
                one++;
            }
        }
        for (int i = 0; i < zero; i++) {
            arr[i] = 0;
        }
        for (int i = zero; i < arr.length; i++) {
            arr[i] = 1;
        }for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
