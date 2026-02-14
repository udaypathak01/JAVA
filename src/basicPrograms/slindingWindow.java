package basicPrograms;

public class slindingWindow {
    public static void main(String[] args) {
        int arr[]={1,-2,3,4,-6,-4,5,6};
        int n=9;
        int max=Integer.MIN_VALUE;
//        window one
    int sum=0;
        for (int i = 0; i <n ; i++) {
            sum+=arr[i];
        }
        if (sum>max){
            max=sum;
        }
        System.out.println(sum);

//        next element insert =n-len-1
        for (int i = 0; i <arr.length ; i++) {
            sum=sum+arr[i]-arr[i-n];
            System.out.println(sum);
            if (sum>max){
                max=sum;
            }
        }
        System.out.println("max sum ="+max);
    }
}
