package LinearSearch;

public class MaxLinear {
    public static void main(String[] args) {
        int[] arr = {2,67,65,96,3};

        int max= MaximumLinear(arr);
        System.out.println(max);
    }

    private static int MaximumLinear(int[] arr) {
        int maxi = 0;
        for (int i = 0; i < arr.length; i++) {
                if (arr[i] > maxi)
                    maxi = arr[i];
        }
        return maxi;
    }
}
