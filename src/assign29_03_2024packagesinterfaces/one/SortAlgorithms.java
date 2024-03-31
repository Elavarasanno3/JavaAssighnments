package assign29_03_2024packagesinterfaces.one;

import java.util.Arrays;
import java.util.Scanner;

public class SortAlgorithms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int l = sc.nextInt();
        int [] arr = new int[l];
        System.out.println("Enter the array Of numbers : ");
        for(int i = 0;i<arr.length;i++){
            System.out.print("Enter the + " +(i+1) + " th number : " );
            arr[i] = sc.nextInt();
        }
        BubbleSort bubbleSort = new BubbleSort();
        SelectionSort selectionSort = new SelectionSort();
        InsertionSort insertionSort = new InsertionSort();
        MergeSort mergeSort = new MergeSort();
        QuickSort quickSort = new QuickSort();

        System.out.print(" 1 -- > Bubble sort\n 2 --> Selection sort\n 3 --> Merge sort\n 4 --> Merge sort\n 5 --> Quick Sor\n");
        System.out.println("Enter the number : ");
        int i = sc.nextInt();

        switch (i){
            case 1 :System.out.println("BubbleSort : " + Arrays.toString(bubbleSort.sort(arr)));
            break;
            case 2 :System.out.println("SelectionSort : " + Arrays.toString(selectionSort.sort(arr)));
            break;
            case 3 :System.out.println("InsertionSort : " + Arrays.toString(insertionSort.sort(arr)));
            break;
            case 4 : System.out.println("MergeSort : " + Arrays.toString(mergeSort.sort(arr ,0,5 )));
            break;
            case 5 :System.out.println("QuickSort : " + Arrays.toString(QuickSort.sort( arr ,0,5 )));
        }






    }
}
class BubbleSort implements Sortable{
    @Override
    public int[] sort(int[]arr) {
        int n = arr.length;
        for(int i = 0;i<arr.length;i++){
            for(int j = 1;j<(n-i);j++){
                if(arr[j-1] > arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}

class SelectionSort implements Sortable{
    public int[]sort(int[]arr){
        for(int i = 0;i<arr.length;i++){
            int index = i;
            for(int j = i;j<arr.length;j++){
                if(arr[j] < arr[index]){
                    index = j;
                }
            }
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
class InsertionSort implements Sortable{
    public int[] sort(int[] arr){
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        return arr;
    }
}

class MergeSort implements Sortable {

    void merge(int[] arr, int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];

        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }


        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    public int[] sort(int[] arr, int l, int r)
    {
        if (l < r) {
            int m = l + (r - l) / 2;

            sort(arr, l, m);
            sort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
        return arr;
    }

    @Override
    public int[] sort(int[] arr) {
        return new int[0];
    }
}

class QuickSort implements Sortable {

    // A utility function to swap two elements
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // This function takes last element as pivot,
    // places the pivot element at its correct position
    // in sorted array, and places all smaller to left
    // of pivot and all greater elements to right of pivot
    static int partition(int[] arr, int low, int high) {
        // Choosing the pivot
        int pivot = arr[high];

        // Index of smaller element and indicates
        // the right position of pivot found so far
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {

            // If current element is smaller than the pivot
            if (arr[j] < pivot) {

                // Increment index of smaller element
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    // The main function that implements QuickSort
    // arr[] --> Array to be sorted,
    // low --> Starting index,
    // high --> Ending index
    static int[] sort(int[] arr, int low, int high) {
        if (low < high) {

            // pi is partitioning index, arr[p]
            // is now at right place
            int pi = partition(arr, low, high);

            // Separately sort elements before
            // partition and after partition
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
        return arr;
    }

    @Override
    public int[] sort(int[] arr) {
        return new int[0];
    }
}