package BinarySearch;

public class GreatestTarget {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key = 5;
        int start = 0;
        int end = arr.length - 1;
        int res = BinarySearchArr(arr, start,end, key);
        if(res!=-1)
            System.out.println("Element found at index: " +(res-1));
        else
            System.out.println("Element not found");
    }

    private static int BinarySearchArr(int[] arr, int start, int end, int key) {
        while(start<=end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key)
                return mid;
            else if (arr[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}

