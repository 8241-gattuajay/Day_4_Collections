package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class RotateKvalues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the list:");
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        System.out.println("Enter the number of values to be rotated:");
        int k = sc.nextInt();

        ArrayList<Integer> rotatedList = rotateKvalues(list, n, k);
        System.out.println("Rotated list:");
        for (int i = 0; i < rotatedList.size(); i++) {
            System.out.println(rotatedList.get(i));
        }
    }

    private static ArrayList<Integer> rotateKvalues(ArrayList<Integer> list,int n, int k) {
        ArrayList<Integer> rotatedList = new ArrayList<Integer>();
        for (int i = k; i < list.size(); i++) {
            rotatedList.add(list.get(i));
        }
        for (int i = 0; i < k; i++) {
            rotatedList.add(list.get(i));
        }
        return rotatedList;
    }

}
