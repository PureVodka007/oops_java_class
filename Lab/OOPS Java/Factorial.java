public class Factorial {
    public static void main(String[] args) {
        if (args.length <= 0) {
            System.out.println("Enter a Num !");
        } else {
            int n = Integer.parseInt(args[0]);
            int p = 1;

            for (int i = 1; i <= n; i++) {
                p = p * i;
            }
            System.out.println("Factorial of " + n + ": " + p);
        }
    }

}
