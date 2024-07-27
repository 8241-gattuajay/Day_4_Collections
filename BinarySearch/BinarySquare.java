package BinarySearch;

public class BinarySquare {
        public static void main(String[] args) {
            int number = 50;
            double precision = 0.0001;
            double sqrt = findSquareRoot(number, precision);
            System.out.println("Square root of " + number + " is approximately: " + sqrt);
        }

        public static double findSquareRoot(int number, double precision) {

            double low = 0;
            double high = number;
            double mid = 0;

            while ((high - low) > precision) {
                mid = (low + high) / 2;
                double midSquared = mid * mid;

                if (midSquared == number) {
                    return mid;
                } else if (midSquared < number) {
                    low = mid;
                } else {
                    high = mid;
                }
            }

            return (low + high) / 2;

        }
    }