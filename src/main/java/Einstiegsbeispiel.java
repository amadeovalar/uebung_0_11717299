// import java.util.Scanner;


public class Einstiegsbeispiel {
    public static void main(String[] args) {

        // Define an array
        int[] numbers = { 212, 500 };
        // Define the second array
        int[] numbers2 = { 400, 12 };

        // Printing out the results

        System.out.println(getInnerProduct(numbers, numbers2));

    }

    /**
     * @param numbers
     * @param numbers2
     * @return
     */
    public static int getInnerProduct(int[] numbers, int[] numbers2) {

        if (numbers.length != numbers2.length) {
            throw new IllegalArgumentException("The arrays do not match in length.", null);
        } else {
            int ergebnis = 0;
            for (int i = 0; i < numbers.length; i++) {
                ergebnis = ergebnis + numbers[i] * numbers2[i];
            }
            return ergebnis;
        }

    }
}
  