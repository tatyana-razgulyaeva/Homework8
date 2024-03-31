public class Main {
    public static void main(String[] args) {

        int[] number = new int[3];
        for (int i = 0; i < number.length; i++) {
            number[i] = i + 1;
        }
        double[] doubles = {1.57, 7.654, 9.986};
        boolean[] bools = {true, false, true, false};

        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]);
            if (i < number.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < doubles.length; i++) {
            System.out.print(doubles[i]);
            if (i < doubles.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < bools.length; i++) {
            System.out.print(bools[i]);
            if (i < bools.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = number.length - 1; i >= 0; i--) {
            System.out.print(number[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = doubles.length - 1; i >= 0; i--) {
            System.out.print(doubles[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = bools.length - 1; i >= 0; i--) {
            System.out.print(bools[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 != 0) {
                number[i]++;
            }
            System.out.print(number[i]);
            if (i < number.length - 1) {
                System.out.print(", ");
            }
        }
    }
}