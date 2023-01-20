import java.util.Scanner;

public class bubble_sort {
    static void bubbleSort(int[] arr) {
        int n = arr.length;//3
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {//2
                if (arr[j - 1] > arr[j]) {
                    // swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }

    }

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of length"); 
        int n = sc.nextInt();
                int[] arr = new int[n];

                for(int i= 0 ; i<n;i++){
                    arr[i] = sc.nextInt();
                }
   bubbleSort(arr);
   sc.close();
   for(int j= 0 ; j<n;j++){
       System.out.print("["+arr[j]+"]"+",");
   
}
        }
}