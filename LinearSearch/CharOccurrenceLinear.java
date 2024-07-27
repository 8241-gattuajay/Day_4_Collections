package LinearSearch;

import java.util.Scanner;

public class CharOccurrenceLinear {
    public static void main(String[] args) {
        String str = "dhanuuuuuuuuuu";
        char val = 'u';
        int fre = CharFre(str, val);
        System.out.println("Character fre of "+val+" is: "+fre);
    }

    private static int CharFre(String str, char val) {
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==val){
                count++;
            }
        }
        return count;
    }
}
