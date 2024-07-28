package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the list");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }

        System.out.println(sortArrayList(list));
    }

    private static ArrayList<Integer> sortArrayList(ArrayList<Integer> list) {
        Collections.sort(list);
        return list;
    }
}
