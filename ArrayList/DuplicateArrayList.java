package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DuplicateArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the list");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        System.out.println(""+findDuplicatesUsingBruteForce(list));

    }

    public static List<Integer> findDuplicatesUsingBruteForce(List<Integer> list) {
        List<Integer> duplicates = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    duplicates.add(list.get(i));
                }
            }
        }
        return duplicates;
    }
}
