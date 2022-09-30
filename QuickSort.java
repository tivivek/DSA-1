package vivekfirstcode;

public class QuickSort {
    public static void main(String[] args) {

        int[] arr = {6, 3, 9, 5, 2, 8};
        int n = arr.length;
        quickSort(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void quickSort(int[] arr, int low, int high) {

        if (low < high) {

            int pivotIndex = partition(arr, low, high);

            quickSort(arr, low,pivotIndex -1);
            quickSort(arr, pivotIndex +1, high);
        }
    }
    public static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = low;

        for (int j = low; j < high; j++) {

            if (arr[j] < pivot) {
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
            }
        }
        //swap
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        //return pivot index
        return i;
    }
}
