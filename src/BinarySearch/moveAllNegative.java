package BinarySearch;


public class moveAllNegative {
    public static void main(String[] args) {
        int[] arr = {1, -1, 3, 2, -7, -5, 11, 6};
        move(arr);

    }

    static void move(int[] arr) {

        int[] brr=new int[arr.length];
        int idx=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                brr[idx++]=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                brr[idx++]=arr[i];
            }
        }

for(int val:brr){
    System.out.print(val+" ");
}
    }
}
