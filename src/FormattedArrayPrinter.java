public class FormattedArrayPrinter {
    public static void main(String[] args) {
        int[] numbers = {30, 57, 93, 15, 31, 30, 49, 16, 30, 93};

        System.out.print("[");
        for (int i = 0; i < numbers.length; i++) {
            if(i != (numbers.length-1)) {
                System.out.print(numbers[i] + ",");
            } else {
                System.out.print(numbers[i] + "]");
            }
        }
    }
}
