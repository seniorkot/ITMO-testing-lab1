package ru.seniorkot.testing.lab1.task2;

public class Sorting {

    public static int[] mergeSort(int[] a) throws IllegalArgumentException{
        if (a == null){
            throw new IllegalArgumentException();
        }
        return mergeSorting(a, 0, a.length - 1);
    }

    /**
     * This function merges 2 sorted arrays
     * @param L - 1st subarray
     * @param R - 2nd subarray
     * @return merged arrays
     */
    public static int[] merge(int L[], int R[]) throws IllegalArgumentException{
        if (L == null || R == null){
            throw new IllegalArgumentException();
        }

        int i, j, k;
        int n1 = L.length;
        int n2 =  R.length;
        int a[] = new int[n1 + n2];

    /* Merge the temp arrays back into arr[l..r]*/
        i = 0; // Initial index of first subarray
        j = 0; // Initial index of second subarray
        k = 0; // Initial index of merged subarray
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
    public static int[] mergeSorting(int a[], int l, int r) throws IllegalArgumentException{
        if (a == null || l > r){
            throw new IllegalArgumentException();
        }

        if (l < r)
        {
            int m = l+(r-l)/2;

            // Sort first and second halves
            int L[] = mergeSorting(a, l, m);
            int R[] = mergeSorting(a, m+1, r);

            return merge(L, R);
        }
        return new int[]{a[l]};
    }
}
