package SortingAlgorithms;
import java.util.Random;

//https://www.geeksforgeeks.org/quicksort-using-random-pivoting/
// https://www.geeksforgeeks.org/quick-sort/

public class QuickSortLomuto {


    // RANDOM PIVOT

    // This Function helps in calculating
    // random numbers between low(inclusive)
    // and high(inclusive)
    public void random(int arr[], int low, int high) {

        Random rand = new Random();
        int pivot = rand.nextInt(high - low) + low;

        int temp1 = arr[pivot];
        arr[pivot] = arr[high];
        arr[high] = temp1;
    }

    /* This function takes last element as pivot,
    places the pivot element at its correct
    position in sorted array, and places all
    smaller (smaller than pivot) to left of
    pivot and all greater elements to right
    of pivot */
    public int partition(int arr[], int low, int high) {
        // pivot is chosen randomly
        random(arr, low, high);
        int pivot = arr[high];


        int i = (low - 1); // index of smaller element
        for (int j = low; j < high; j++) {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] < pivot) {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }


    /* The main function that implements QuickSort()
    arr[] --> Array to be sorted,
    low --> Starting index,
    high --> Ending index */
    public void sort(int arr[], int low, int high) {
        if (low < high) {
            /* pi is partitioning index, arr[pi] is
            now at right place */
            int pi = partition(arr, low, high);

            // Recursively sort elements before
            // partition and after partition
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }

    /* A utility function to print array of size n */
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}

       /// NORMAL PIVOT


//    static void Swap(int[] array,
//                     int position1,
//                     int position2)
//    {
//        // Swaps elements in an array
//
//        // Copy the first position's element
//        int temp = array[position1];
//
//        // Assign to the second element
//        array[position1] = array[position2];
//
//        // Assign to the first element
//        array[position2] = temp;
//    }
//
//    /* This function takes last element as
//    pivot, places the pivot element at its
//    correct position in sorted array, and
//    places all smaller (smaller than pivot)
//    to left of pivot and all greater elements
//    to right of pivot */
//    static int partition(int []arr, int low,
//                         int high)
//    {
//        int pivot = arr[high];
//
//        // Index of smaller element
//        int i = (low - 1);
//
//        for (int j = low; j <= high- 1; j++)
//        {
//            // If current element is smaller
//            // than or equal to pivot
//            if (arr[j] <= pivot)
//            {
//                i++; // increment index of
//                // smaller element
//                Swap(arr, i, j);
//            }
//        }
//        Swap(arr, i + 1, high);
//        return (i + 1);
//    }
//
//    /* The main function that
//       implements QuickSort
//    arr[] --> Array to be sorted,
//    low --> Starting index,
//    high --> Ending index */
//    public void quickSort(int []arr, int low,
//                          int high)
//    {
//        if (low < high)
//        {
//        /* pi is partitioning index,
//        arr[p] is now at right place */
//            int pi = partition(arr, low, high);
//
//            // Separately sort elements before
//            // partition and after partition
//            quickSort(arr, low, pi - 1);
//            quickSort(arr, pi + 1, high);
//        }
//    }
//
//
//    /* Function to print an array */
//    public void printArray(int []arr)
//    {
//        int i;
//        for (i = 0; i < arr.length; i++)
//            System.out.print(" " + arr[i]);
//        System.out.println();
//    }


