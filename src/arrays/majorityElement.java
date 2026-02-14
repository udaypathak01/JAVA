package arrays;

public class majorityElement {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2,2};
        int[] hash = new int[10];
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;
        }
        int largest = hash[0];
        int element=-1;
        for (int i = 0; i < hash.length; i++) {
            if (largest < hash[i]) {
                largest=hash[i];
                element=i;
            }
        }
        System.out.println(element);
    }
}
//it is not working for negative array elements so please read the hash table concepts
//use hashmap form std library