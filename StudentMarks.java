import java.util.ArrayList;
import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> marksList = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks for student " + (i + 1) + ": ");
            int marks = sc.nextInt();
            marksList.add(marks);
        }

        int highest = marksList.get(0);
        int lowest = marksList.get(0);

        for (int m : marksList) {
            if (m > highest) {
                highest = m;
            }
            if (m < lowest) {
                lowest = m;
            }
        }

        System.out.println("\nMarks List: " + marksList);
        System.out.println("Highest Marks: " + highest);
        System.out.println("Lowest Marks: " + lowest);

        sc.close();
    }
}