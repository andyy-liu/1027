import java.util.Scanner;

public class MinimumDaysToPrintStatues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int days = 0;
        // int printers = 2;
        int printers = 1;

        // while we do not have enough printers to print the statues in one day

        while (printers < n) { // while (printers <= n)
            printers *= 2;
            days += 1; // days += 2;
        }

        // add the days required to print the remaining statues with the available
        // printers

        days += 1; // days += (int) Math.ceil((double) n / printers);

        System.out.println(days);
    }
}
