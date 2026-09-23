import java.util.Scanner;
public class juhgvc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();
        int[] sid = new int[n];
        String[] snames = new String[n];
        String[] dept = new String[n];
        int[] marks = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Student " + (i + 1));
            System.out.print("Student Name: ");
            snames[i] = sc.next();
            System.out.print("Student ID: ");
            sid[i] = sc.nextInt();
            System.out.print("Department: ");
            dept[i] = sc.next();
            System.out.print("Marks: ");
            marks[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (marks[i] < marks[j]) {
                    int tempMarks = marks[i];
                    marks[i] = marks[j];
                    marks[j] = tempMarks;
                    int tempId = sid[i];
                    sid[i] = sid[j];
                    sid[j] = tempId;
                    String tempName = snames[i];
                    snames[i] = snames[j];
                    snames[j] = tempName;
                    String tempDept = dept[i];
                    dept[i] = dept[j];
                    dept[j] = tempDept;
                }
            }
        }
        System.out.println("\nStudent Name\tStudent ID\tDepartment\tMarks");
        for (int i = 0; i < n; i++) {
            System.out.println(
                    snames[i] + "\t\t" +
                    sid[i] + "\t\t" +
                    dept[i] + "\t\t" +
                    marks[i]
            );
        }
        sc.close();
    }
}