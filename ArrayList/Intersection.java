package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Intersection {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the list");
        int m=sc.nextInt();
        for(int i=0;i<m;i++){
            list.add(sc.nextInt());
        }
        System.out.println("Enter the number of elements in the list1");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            list1.add(sc.nextInt());
        }

        System.out.println(intersectionList(list,list1));
    }

    private static ArrayList<Integer> intersectionList(ArrayList<Integer> list, ArrayList<Integer> list1) {
        ArrayList<Integer> intersection = new ArrayList<Integer>();
        for(int i=0;i<list.size();i++){
            if(list1.contains(list.get(i))){
                intersection.add(list.get(i));
            }
        }
        return intersection;
    }
}
