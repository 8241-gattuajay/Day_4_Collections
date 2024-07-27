package BinarySearch;

public class BitonicArray {
    public static void main(String[] args) {
        int [] arr={1, 3, 50, 10, 9, 7, 6};
        int low=0;
        int high=arr.length-1;

        int peak=bitonicArray(arr,low,high);

        System.out.println("Peak element is at index: "+peak);
    }

    private static int bitonicArray(int[] arr, int low, int high) {

        if(low==high){
            return low;
        }

        if((high==low+1) && arr[low]>=arr[high]){
            return low;
        }

        if((high==low+1) && arr[low]<arr[high]){
            return high;
        }
        int mid=(low+high)/2;


        if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1])
            return mid;

        if(arr[mid]>arr[mid+1] && arr[mid]<arr[mid-1])
            return bitonicArray(arr,low,mid-1);
        else
            return bitonicArray(arr,mid+1,high);
    }
}
