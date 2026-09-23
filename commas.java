import java.util.Scanner;

public class commas {
    void test(){
        System.out.println("\nNumber of Commas Finder.");
    }
    public static void main(String[] args) {
        commas obj = new commas();
        obj.test();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String number = scanner.next();
        int j = 0,k=0;
        if(number.length()%2==0) 
            k=1;
        j=(number.length()-3)/2;
        System.out.println("Number of commas: " + (j+k));
        scanner.close();
    }
}