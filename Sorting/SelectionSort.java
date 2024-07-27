package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {64, 34, 25, 12, 22, 11, 90};

        int[] res=selectionSort(arr);
        for(int i=0;i< arr.length;i++){
            System.out.print(" "+res[i]);
        }
    }

    private static int[] selectionSort(int[] arr) {
        for(int i=0;i< arr.length;i++){
            int index=i;
            for(int j=i+1;j< arr.length;j++){
                if(arr[j]<arr[i])
                    index=j;
            }
            int temp=arr[index];
            arr[index]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }
}
