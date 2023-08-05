

package com.mycompany.q5;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Q5 {

    public static void main(String[] args) {
        int[] grades = new int[20];
        int gradeCount = 0;

        Scanner scanner = new Scanner(System.in);

        while (gradeCount < 20) {
            System.out.print("Enter a grade (-1 to stop): ");
            int grade = scanner.nextInt();
            if (grade == -1) {
                break;
            }
            grades[gradeCount] = grade;
            gradeCount++;
        }
        scanner.close();

        if (gradeCount == 0) {
            System.out.println("No grades entered.");
        } else {
            double average = calculateAverage(grades, gradeCount);

            // Format the average to 2 decimal places using DecimalFormat
            DecimalFormat df = new DecimalFormat("#.00");
            String formattedAverage = df.format(average);

            System.out.println("Average grade: " + formattedAverage);
        }
    }

    public static double calculateAverage(int[] grades, int gradeCount) {
        if (gradeCount == 0) {
            return 0;
        }

        int sum = 0;
        for (int i = 0; i < gradeCount; i++) {
            sum += grades[i];
        }
        return (double) sum / gradeCount;
    }
}
