import java.util.Scanner;

public class Program9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Number of students
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();

        // Create a 2D array to store marks for Physics, Chemistry, and Math
        int[][] marks = new int[numStudents][3];

        // Input marks for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ": ");
            System.out.print("Physics: ");
            marks[i][0] = sc.nextInt();
            System.out.print("Chemistry: ");
            marks[i][1] = sc.nextInt();
            System.out.print("Math: ");
            marks[i][2] = sc.nextInt();
        }

        // Process each student's marks
        for (int i = 0; i < numStudents; i++) {
            int physics = marks[i][0];
            int chemistry = marks[i][1];
            int math = marks[i][2];

            // Calculate total, percentage, and average
            int sum = physics + chemistry + math;
            int percentage = (sum * 100) / 300;
            int avg = sum / 3;

            // Determine grade and remarks
            String grade;
            String remarks;

            if (percentage <= 39) {
                grade = "R";
                remarks = "Remedial standards";
            } else if (percentage >= 40 && percentage <= 49) {
                grade = "E";
                remarks = "Level 1-, too below agency-normalized standards";
            } else if (percentage >= 50 && percentage <= 59) {
                grade = "D";
                remarks = "Level 1, well below agency-normalized standards";
            } else if (percentage >= 60 && percentage <= 69) {
                grade = "C";
                remarks = "Level 2, below, but approaching agency-normalized standards";
            } else if (percentage >= 70 && percentage <= 79) {
                grade = "B";
                remarks = "Level 3, at agency-normalized standards";
            } else {
                grade = "A";
                remarks = "Level 4, above agency-normalized standards";
            }

            // Display results for the student
            System.out.println("\nResults for Student " + (i + 1) + ":");
            System.out.println("Physics Marks: " + physics);
            System.out.println("Chemistry Marks: " + chemistry);
            System.out.println("Math Marks: " + math);
            System.out.println("Average Marks: " + avg);
            System.out.println("Grade: " + grade);
            System.out.println("Remarks: " + remarks);
        }

        sc.close();
    }
}
