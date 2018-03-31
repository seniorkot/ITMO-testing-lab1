package ru.seniorkot.testing.lab1.task2;

public class Sorting {

    public static int[] mergeSort(int[] a){
        return mergeSorting(a, 0, a.length - 1);
    }

    private static int[] swap(int[] a, int i, int j){
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
        return a;
    }

    private static int[] quickSorting(int[] a, int lower, int higher){
        int i = lower;
        int j = higher;

        int pivot = a[lower+(higher-lower)/2];
        // Divide into two arrays
        while (i <= j) {
            while (a[i] < pivot) {
                i++;
            }
            while (a[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swap(a, i, j);
                //move index to next position on both sides
                i++;
                j--;
            }
        }
        if (lower < j)
            quickSorting(a, lower, j);
        if (i < higher)
            quickSorting(a, i, higher);
        return a;
    }

    private static int[] merge(int a[], int l, int m, int r){
        int i, j, k;
        int n1 = m - l + 1;
        int n2 =  r - m;

    /* create tmp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];

    /* Copy data to tmp arrays L[] and R[] */
        for (i = 0; i < n1; i++)
            L[i] = a[l + i];
        for (j = 0; j < n2; j++)
            R[j] = a[m + 1+ j];

    /* Merge the temp arrays back into arr[l..r]*/
        i = 0; // Initial index of first subarray
        j = 0; // Initial index of second subarray
        k = l; // Initial index of merged subarray
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                a[k] = L[i];
                i++;
            }
            else
            {
                a[k] = R[j];
                j++;
            }
            k++;
        }

    /* Copy the remaining elements of L[], if there
       are any */
        while (i < n1)
        {
            a[k] = L[i];
            i++;
            k++;
        }

    /* Copy the remaining elements of R[], if there
       are any */
        while (j < n2)
        {
            a[k] = R[j];
            j++;
            k++;
        }
        return a;
    }

    private static int[] mergeSorting(int a[], int l, int r){
        if (l < r)
        {
            int m = l+(r-l)/2;

            // Sort first and second halves
            mergeSorting(a, l, m);
            mergeSorting(a, m+1, r);

            merge(a, l, m, r);
        }
        return a;
    }
}
