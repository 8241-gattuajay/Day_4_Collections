package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {64, 34, 25, 12, 22, 11, 90};

        int[] res=bubbleSort(arr);
        for(int i=0;i< arr.length;i++){
            System.out.print(" "+res[i]);
        }
    }

    private static int[] bubbleSort(int[] arr) {
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[j]<arr[i]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        return arr;
    }
}
