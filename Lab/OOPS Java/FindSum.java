public class FindSum {
    public static void main(String[] args) {
        int a, b;
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);

        System.out.println("Sum: " + (a + b));
        System.out.println("Average: " + ((a + b) / 2));
        System.out.println("Maximum: " + Math.max(a, b));
        System.out.println("Mininum: " + Math.min(a, b));

    }
}
