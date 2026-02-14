package sorting;

public class practice {
    public static void main(String[] args) {
        int[] arr = {2, 436, 5, 2, 4, 57, 7, 2, 1,};
        int n=arr.length;

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n-i-1 ; j++) {
                if (arr[j]>arr[j+1]){
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
