package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MaxandMin {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the list");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }

        maxandMin(list);
    }

    private static void maxandMin(ArrayList<Integer> list) {

        System.out.println("Maximum value in the list is : "+Collections.max(list));
        System.out.println("Minimum value in the list is : "+Collections.min(list));
    }
}
