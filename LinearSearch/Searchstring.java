package LinearSearch;

import java.util.Scanner;

public class Searchstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String[] str= new String[n];
        for(int i=0;i< str.length;i++){
            str[i]=sc.nextLine();
        }
        String val= sc.nextLine();

        System.out.println("String found at index : "+LinearStringSearch(str,val));
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
