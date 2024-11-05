import java.util.Scanner;

public class pre_2 {
    public static void main(String[] args){
        Scanner in =  new Scanner(System.in);
        System.out.println("Enter the number of elements you want to sort : ");
        int n = in.nextInt();

        int arr[];
        arr = new int[n];

        for(int i=0; i<n; i++) {
            System.out.printf("Enter the number - %d : ",i+1);
            arr[i] = in.nextInt(); 
        }

        int temp ; 
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(arr[i]>arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp ;
                }
            }
        }
        System.out.println("The sorted array : ");
        for(int i=0;i<n; i++){
            System.out.printf("|%d|->",arr[i]);
        }
        System.out.println("NULL");
    }
}
