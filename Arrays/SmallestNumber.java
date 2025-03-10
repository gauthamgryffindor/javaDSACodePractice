package Arrays;

public class SmallestNumber {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;

        int[] arr={2,4,9,6,0,7,2,1};
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
