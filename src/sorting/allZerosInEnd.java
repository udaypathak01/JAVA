package sorting;

public class allZerosInEnd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        int n=arr.length;

        for (int i = 0; i <n ; i++) {

            for (int j = 0; j <n-i-1 ; j++) {
                if (arr[j]==0){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        for (int val:arr){
            System.out.print(val+" ");
        }
    }
}
