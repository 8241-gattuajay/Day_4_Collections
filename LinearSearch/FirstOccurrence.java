package LinearSearch;

public class FirstOccurrence {
    public static void main(String[] args) {
        int [] arr = {2,34,56,44,34};

        int key=22;

        int index=FirstLinearOccurrence(arr,key);
        if(index==-1)
            System.out.println("Element not found");
        else
        System.out.println("Element first occurrence index : " + index);
    }
    
    private static int FirstLinearOccurrence(int[] arr, int key) {
        for(int i=0;i< arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
}
