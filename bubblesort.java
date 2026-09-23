import java.util.Scanner;
class bubblesort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        System.out.println("Enter the elements: ");
        int temp;
        int ar[] = new int[n];
        for(int i=0;i<n;i++)
            ar[i]=scanner.nextInt();
        for(int j=0; j<=n-1; j++){
            for(int k=0;k<n-1;k++){
                if(ar[k]>ar[k+1]){
                    temp=ar[k];
                    ar[k]=ar[k+1];
                    ar[k+1]=temp;
                }
            }
        }
        System.out.println("Sorted elements are: ");
        for(int i=0; i<n;i++)
            System.out.print(ar[i]+" ");
        scanner.close();
    }
}