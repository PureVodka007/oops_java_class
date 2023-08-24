
public class Fib {
    /*
     * This program gets input from user and prints fibonacci sequence of that num
     * 
     * 4/8/23
     */
    public static void main(String[] args) {

        if (args.length <= 0) {
            System.out.println("Please Enter a Num!");

        } else {

            int n = Integer.parseInt(args[0]);
            int c;
            int a = 0;
            int b = 1;

            for (int i = 0; i < n; i++) {
                System.out.print(a + " ");
                c = a + b;
                a = b;
                b = c;

            }

        }

    }
}