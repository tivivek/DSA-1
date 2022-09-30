package vivekfirstcode;

import java.util.Scanner;

public class ImplementSorting {
    public static void main(String[] args) {
        Scanner inputTaker = new Scanner(System.in);

        int n = inputTaker.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = inputTaker.nextInt();
        }
        insertionSort(arr, n);
        for (int i = 0; i < n; i++) {

            System.out.print(arr[i] + " ");
        }
    }
        //buble sort implementation
     static void bubbleSort(int[] arr, int n) {
        for (int i = 0; i < n-1; i++) {

            for (int j = 0; j < n -i -1; j++) {

                if ( arr[j] > arr[j +1] ) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j +1];
                    arr[j +1] = temp;
                }
            }
        }
    }
    static void selectionSort(int[] arr, int n) {

        for (int i = 0; i < n; i++) {
            int smallest = i;
            for (int j = i +1; j < n; j++) {

                if (arr[smallest] > arr[j] ) {

                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
    }
    static void insertionSort(int[] arr, int n) {

        for (int i = 1; i < n; i++) {

            int current = arr[i];
            int j = i -1;

            while (j >= 0 && arr[j] > current) {
                arr[j +1] = arr[j];
                j--;
            }
            //placement
            arr[j +1] = current;
        }
    }
}
