package ru.seniorkot.testing.lab1.task2;

public class Sorting {

    public static int[] mergeSort(int[] a) throws IllegalArgumentException{
        if (a == null){
            throw new IllegalArgumentException();
        }
        return mergeSorting(a, 0, a.length - 1);
    }

    /**
     * This function merges 2 sorted arrays (a[l...m] & a[m...r])
     * @param a - input array
     * @param l - left index
     * @param m - middle index
     * @param r - right index
     * @return sorted array from l position to r
     */
    public static int[] merge(int a[], int l, int m, int r){
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

    /**
     * This method divides array into 2 parts and merges them after sorting
     * @param a - int array (not sorted)
     * @param l - left index
     * @param r - right index
     * @return - sorted int array from l position to r
     */
    public static int[] mergeSorting(int a[], int l, int r){
        if (a == null || l > r){
            throw new IllegalArgumentException();
        }

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
