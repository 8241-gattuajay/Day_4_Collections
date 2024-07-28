package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Union {
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

        System.out.println(UnionList(list,list1));
    }

    private static ArrayList<Integer> UnionList(ArrayList<Integer> list, ArrayList<Integer> list1) {
        ArrayList<Integer> union = new ArrayList<Integer>();
        for(int i=0;i<list.size();i++){
            if(!union.contains(list.get(i))){
                union.add(list.get(i));
            }
        }
        for(int i=0;i<list1.size();i++){
            if(!union.contains(list1.get(i))){
                union.add(list1.get(i));
            }
        }
        return union;
    }
}
