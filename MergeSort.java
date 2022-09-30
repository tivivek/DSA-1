package vivekfirstcode;

public class MergeSort {
    public static void main(String[] args) {

        int[] arr = {8, 3, 5, 9, 7};
        int n = arr.length;
        sort(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
    public static  void sort(int[] arr, int start, int end) {

        if (start < end) {

            int mid = start + (end - start) / 2;
            sort(arr, start, mid);
            sort(arr, mid + 1, end);

            merge(arr, start, mid, end);
        }
    }
    public static  void merge(int[] arr, int start, int mid, int end) {

        int n1 = mid - start +1;
        int n2 = end - mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = arr[start +i];
        }

        for (int i = 0; i < n2; i++) {
            right[i] = arr[mid +1 +i];
        }

        int i = 0;
        int j = 0;
        int k = start;

        while (i < n1 && j < n2) {

            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            }
            else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < n1) {

            arr[k] = left[i];
            k++;
            i++;
        }
        while (j < n2) {

            arr[k] = right[j];
            k++;
            j++;
        }
    }
}
