package ru.seniorkot.testing.lab1.task2;

import org.junit.Test;
import static org.junit.Assert.*;

public class SortingTest {

    @Test(expected = IllegalArgumentException.class)
    public void testNullMergeSort(){
        int a[] = null;
        Sorting.mergeSort(a);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullMerge(){
        int a[] = null;
        int b[] = null;
        Sorting.merge(a, b);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullMergeSorting(){
        int a[] = null;
        Sorting.mergeSorting(a, 0, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIllegalMergeSorting(){
        int a[] = {4, 2, 4, 14, 88};
        Sorting.mergeSorting(a, 5, 3);
    }

    @Test
    public void testZeroMergeSort(){
        int a[] = {};
        int res[] = {};
        assertArrayEquals(Sorting.mergeSort(a), res);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testZeroMergeSorting(){
        int a[] = {};
        int res[] = {};
        assertArrayEquals(Sorting.mergeSorting(a, 0, 0), res);
    }

    @Test
    public void testOneMergeSort(){
        int a[] = {5};
        int res[] = {5};
        assertArrayEquals(Sorting.mergeSort(a), res);
    }

    @Test
    public void testOneMergeSorting(){
        int a[] = {5};
        int res[] = {5};
        assertArrayEquals(Sorting.mergeSorting(a, 0, 0), res);
    }

    @Test
    public void testSameMergeSort(){
        int a[] = {5, 5, 5};
        int res[] = {5, 5, 5};
        assertArrayEquals(Sorting.mergeSort(a), res);
    }

    @Test
    public void testSortedMergeSort(){
        int a[] = {1, 2, 3, 4, 5, 6};
        int res[] = {1, 2, 3, 4, 5, 6};
        assertArrayEquals(Sorting.mergeSort(a), res);
    }

    @Test
    public void testSortedMerge(){
        int a[] = {1, 3, 4};
        int b[] = {2, 5, 6};
        int res[] = {1, 2, 3, 4, 5, 6};
        assertArrayEquals(Sorting.merge(a, b), res);
    }

    @Test
    public void testNotSortedMerge(){
        int a[] = {4, 3, 1};
        int b[] = {6, 5, 2};
        int res[] = {4, 3, 1, 6, 5, 2};
        assertArrayEquals(Sorting.merge(a, b), res);
    }

    @Test
    public void testMinusMergeSort(){
        int a[] = {-3, -22, -5, -1, -15, -6};
        int res[] = {-22, -15, -6, -5, -3, -1};
        assertArrayEquals(Sorting.mergeSort(a), res);
    }

    @Test
    public void testMergeSort() {
        int a[] = {66, 9, 31, 96, 21, 17, 67, 54, 30, 81, 51, 87, 66, 26, 28, 50, 9, 86, 58, 63, 76,
                55, 66, 97, 59, 13, 27, 59, 79, 41, 50, 22, 26, 56, 87, 50, 15, 23, 51, 55, 83, 16, 86, 23, 6, 61, 98, 16, 35, 49};
        int res[] = {6, 9, 9, 13, 15, 16, 16, 17, 21, 22, 23, 23, 26, 26, 27, 28, 30, 31, 35, 41, 49, 50, 50, 50, 51, 51, 54, 55,
                55, 56, 58, 59, 59, 61, 63, 66, 66, 66, 67, 76, 79, 81, 83, 86, 86, 87, 87, 96, 97, 98};
        assertArrayEquals(Sorting.mergeSort(a), res);
    }
}
