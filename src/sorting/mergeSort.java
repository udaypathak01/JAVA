package sorting;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr = {2, 8, 6, 3, 4, 1, 7};
        int n = arr.length;
        divideHelp(arr,0,n-1);
    }

    public static void divideHelp(int[] arr, int left, int right) {
        if (left < right) {
            for (int i = left; i <= right; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            int mid = left + (right - left) / 2;
            divideHelp(arr,left,mid);
            divideHelp(arr,mid+1,right);
        }
        if (left==right){
            for (int i = left; i <= right; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}
