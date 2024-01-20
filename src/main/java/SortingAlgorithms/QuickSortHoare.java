package SortingAlgorithms;
//https://www.geeksforgeeks.org/hoares-vs-lomuto-partition-scheme-quicksort/
//https://www.geeksforgeeks.org/quicksort-using-random-pivoting/
public class QuickSortHoare {



    /* This function takes first element as pivot, and
      places all the elements smaller than the pivot on the
      left side and all the elements greater than the pivot
      on the right side. It returns the index of the last
      element on the smaller side*/
//    static int partition(int[] arr, int low, int high)
//    {
//        int pivot = arr[low];
//        int i = low - 1, j = high + 1;
//
//        while (true) {
//            // Find leftmost element greater
//            // than or equal to pivot
//            do {
//                i++;
//            } while (arr[i] < pivot);
//
//            // Find rightmost element smaller
//            // than or equal to pivot
//            do {
//                j--;
//            } while (arr[j] > pivot);
//
//            // If two pointers met.
//            if (i >= j)
//                return j;
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//            // swap(arr[i], arr[j]);
//        }
//    }
//
//    /* The main function that
//       implements QuickSort
//    arr[] --> Array to be sorted,
//    low --> Starting index,
//    high --> Ending index */
//    public void quickSort(int[] arr, int low, int high)
//    {
//        if (low < high) {
//            /* pi is partitioning index,
//            arr[p] is now at right place */
//            int pi = partition(arr, low, high);
//
//            // Separately sort elements before
//            // partition and after partition
//            quickSort(arr, low, pi);
//            quickSort(arr, pi + 1, high);
//        }
//    }
//
//    /* Function to print an array */
//    public void printArray(int[] arr)
//    {
//        for (int i = 0; i < arr.length; i++)
//            System.out.print(" " + arr[i]);
//        System.out.println();
//    }



    // swap function
    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /*
    // partition function
    This function takes array, low and high index,
    swaps low with random index between low and high
    then places all elements less than pivot in the left
    of pivot and all elements greater than pivot to the
    right of pivot
    */


    static int partition(int[] arr, int low, int high)
    {
        // rIndex gives the random index between low and
        // high (both inclusive)
        int rIndex = (low) + (int)(Math.random() * (high - low + 1));

        swap(arr, low, rIndex); // swap low with random index
        int pivot = arr[low];
        int i = low - 1, j = high + 1;

        while (true) {
            // increase i while elements are less than pivot
            do {
                i++;
            } while (arr[i] < pivot);

            // decrease j while elements are greater than pivot
            do {
                j--;
            } while (arr[j] > pivot);

            if (i >= j) // when both pointers meet
                // that means elements are at their
                // correct place for now
                return j;

            swap(arr, i, j);
            // swap i and j, since both are not at their
            // correct index
        }
    }

    // recursive quick sort function
    public void quickSort(int[] arr, int low, int high)
    {
        if (low < high) {
            // find partition index
            int p = partition(arr, low, high);
            // sort before and after the pivot
            quickSort(arr, low, p);
            quickSort(arr, p + 1, high);
        }
    }

}
