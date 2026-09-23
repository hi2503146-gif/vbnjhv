import java.util.Scanner;
public class ygf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array : ");
        int n=sc.nextInt();
        int sid[]=new int[n];
        int i,j,t;
        for(i=0;i<n;i++) 
            sid[i] = sc.nextInt();
        System.out.println("Elements before sorting: ");
        for(i=0;i<n;i++)
            System.out.print(sid[i] + " ");
        System.out.println();
        for(i=1;i<n;i++) {
            for(j=0;j<n-i;j++) {
                if(sid[j]>sid[j+1]){
                    t=sid[j];
                    sid[j]=sid[j+1];
                    sid[j+1]=t;
                }
            }
        }
        System.out.println("Elements after sorting: ");
        for(i=0;i<n;i++)
            System.out.print(sid[i] + " ");
    }
}