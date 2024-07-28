package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class NoduplicateArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the list");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        System.out.println(""+noDuplicatesUsingBruteForce(list));
    }

    private static ArrayList<Integer> noDuplicatesUsingBruteForce(ArrayList<Integer> list) {
        ArrayList<Integer> noduplicates = new ArrayList<Integer>();

        for(int i=0;i<list.size();i++){
            if(!noduplicates.contains(list.get(i))){
                noduplicates.add(list.get(i));
            }
        }
        return noduplicates;
    }
}
