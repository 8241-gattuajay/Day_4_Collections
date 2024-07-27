package LinearSearch;

public class NonDuplicate {
    public static void main(String[] args) {
        String str = "gattu";
        String res = NonDuplicateFirst(str);
        System.out.println("Element : " + res);
    }

    public static String NonDuplicateFirst(String str) {

        for(int i=0;i<str.length();i++){
            boolean unique=true;
            for(int j=0;j<str.length();j++){
                if(i!=j && str.charAt(i)==str.charAt(j)){
                    unique=false;
                    break;
                }
            }
            if(unique)
                return String.valueOf(str.charAt(i));
        }

        return "No unique element found";
    }
}
