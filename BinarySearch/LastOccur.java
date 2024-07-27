package BinarySearch;

public class LastOccur {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 2, 3, 4, 7, 8, 8};
        int target = 2;

        int lastIndex = findLastOccurrence(arr, target);
        if (lastIndex != -1) {
            System.out.println("Last occurrence of " + target + " is at index: " + lastIndex);
        } else {
            System.out.println(target + " not found in the array.");
        }
    }

    public static int findLastOccurrence(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int lastIndex = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                lastIndex = mid; 
                low = mid + 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return lastIndex;
    }
}

