package LinearSearch;

import java.util.Arrays;

public class IndexOccur {
    public static void main(String[] args) {
        int [] arr={2,3,4,2,2,2};

        int key=2;

        int[] res= IndexOccurrence(arr,key);
        for(int i=0;i< arr.length;i++){
            if(res[i]!=-1)
                System.out.print(" "+res[i]);
        }
    }

    public static int[] IndexOccurrence(int[] arr, int key){

        int[] gat=new int[arr.length];
        for(int i=0;i< arr.length;i++){
            if(arr[i]==key){
                gat[i]=i;
            }
            else {
                gat[i]=-1;
            }
        }
        return gat;
    }
}
