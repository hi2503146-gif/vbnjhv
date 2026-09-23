import java.util.Scanner;
public class vsjvd {
    void details(long sid, String sname, String dept, long number) {
        System.out.println("Student ID: " + sid);
        System.out.println("Student Name: " + sname);
        System.out.println("Department: " + dept);
        System.out.println("Number: " + number);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student ID: ");
        long sid = sc.nextLong();
        System.out.print("Enter Student Name: ");
        String sname = sc.next();
        System.out.print("Enter Department: ");
        String dept = sc.next();
        System.out.print("Enter Number: ");
        long number = sc.nextLong();
        vsjvd student = new vsjvd();
        student.details(sid, sname, dept, number);
        sc.close();
    }
}