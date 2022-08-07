package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner key = new Scanner(System.in);

        System.out.print("How many students will be entered? ");
        int n = key.nextInt();

        String[] name = new String[n];
        double[] grade1 = new double[n];
        double[] grade2 = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter name, first and second grade do student #" + (i + 1));
            key.nextLine();
            name[i] = key.nextLine();

            grade1[i] = key.nextDouble();
            grade2[i] = key.nextDouble();
        }

        double average = 0.0;

        System.out.println();
        System.out.println("Approved students: ");
        for (int i = 0; i < n; i++) {
            average = (Double) (grade1[i] + grade2[i]) / 2;
            if (average >= 6.0) {
                System.out.println(name[i]);
            }


        }

    }
}
