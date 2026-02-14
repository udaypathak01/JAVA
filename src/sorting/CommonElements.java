package sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class CommonElements {
    public static void main(String[] args) {
        int a[] = {3, 4, 2, 2, 4};
        int b[] = {3, 2, 2, 7};
       commonElements(a, b);
    }

    public static ArrayList<Integer> commonElements(int a[], int b[]) {
        // Your code here
        ArrayList<Integer> brr = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);
        int i=0,j=0;
        for (int k = 0; k <a.length ; k++) {
            if (a[i]==b[j]){
                brr.add(i,a[i]);
                i++;
                j++;
            }
        }
        return brr;
    }

}
