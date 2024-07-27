package LinearSearch;

public class Searchstring {
    public static void main(String[] args) {
        String[] arr={"Ajay","Dhanu","Abbu","Madhu","Bramha"};

        String val="Dhanu";

        System.out.println("String found at index : "+LinearStringSearch(arr,val));
    }

    private static int LinearStringSearch(String[] arr, String val) {
        for(int i=0;i< arr.length;i++){
            if(arr[i].equals(val)){
                return i;
            }
        }
        return -1;
    }
}
