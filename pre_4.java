public class pre_4 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide a number as a command-line argument.");
            return;
        }

        try {
            int number = Integer.parseInt(args[0]);

            if (number < 0) {
                System.out.println("Please provide a non-negative integer.");
                return;
            }

            long factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            System.out.println("Factorial of " + number + " is: " + factorial);
        } catch (NumberFormatException e) {
            System.out.println("Please provide a valid integer.");
        }
    }
}
