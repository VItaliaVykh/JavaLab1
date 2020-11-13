import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Class obj = new Class();
        obj.show();
        System.out.println("hello world");
        Scanner scan = new Scanner(System.in);
        int x1 = scan.nextInt(), x2 = scan.nextInt(), x3 = scan.nextInt();
        System.out.println(x1 + ", " + x2 + ", " + x3);

        Interval Interval = new Interval();
        System.out.print("Enter start of interval: ");
        Interval.sinterval = scan.nextInt();
        System.out.print("Enter finish of interval: ");
        Interval.finterval = scan.nextInt();

        System.out.print("Print Odds: ");
        Interval .POdd();
        System.out.print("Print evens: ");
        Interval.PEven();

        System.out.println("Sum of odd numbers: " + Interval.AddOdd());
        System.out.println("Sum of even numbers: " + Interval.AddEven());

        System.out.print("Enter length of Fibonacci: ");
        int length = scan.nextInt();
        if (Interval.finterval % 2 != 0) {
            System.out.print("Fibonacci: " + Interval.finterval + " ");
            Interval.even++;
        }
        else if (Interval.finterval % 2 == 0) {
            System.out.print("Fibonacci: " + (Interval.finterval - 1) + " ");
            Interval.odd++;
        }
        for (int i = 0; i < length - 1; ++i)
            System.out.print(Interval.Fibonacci(i) + " ");

        System.out.println("\nRate of odd numbers: " + Interval.rateOdd(length) + "%");
        System.out.println("Rate of even numbers: " + Interval.rateEven(length) + "%");

    }}

