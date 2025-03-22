// Online Java Compiler
package Recursion;
class Main {
    public static void main(String[] args) {
        int[] a={5,4,3,2,1};
        mergesort(a,0,a.length-1);
        for(int i:a){
            System.out.println(i);
        }
    }
    public static void mergesort(int arr[],int l,int h){
        if(l>=h){
            return;
        }
        int mid=l+(h-l)/2;
        mergesort(arr,l,mid);
        mergesort(arr,mid+1,h);
        mergeInPlace(arr,l,mid,h);
    }
static void mergeInPlace(int[] arr, int left, int mid, int right) {
        int i = left, j = mid + 1;
        // if(j>=3)
        //  System.out.println(Arrays.toString(arr)+" "+left+" "+mid+" "+right);
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                i++;
            } else {
                int value = arr[j];
                int index = j;

                // Shift elements to the right to make space
                while (index > i) {
                    arr[index] = arr[index - 1];
                    index--;
                }

                arr[i] = value;

                // Update indices
                i++;
                mid++;
                j++;
            }
        }
    }
}