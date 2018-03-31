package ru.seniorkot.testing.lab1.task2;

import org.junit.Test;
import static org.junit.Assert.*;

public class SortingTest {

    private static final int res[] = {5, 11, 23, 33, 40, 56, 66, 67, 68, 68, 83, 93};

    @Test
    public void testInsertingSort() {
        int a[] = {68, 23, 66, 83, 56, 67, 33, 40, 93, 5, 11, 68};
        assertArrayEquals(Sorting.insertionSort(a), res);
    }

    @Test
    public void testSelectiongSort() {
        int a[] = {68, 23, 66, 83, 56, 67, 33, 40, 93, 5, 11, 68};
        assertArrayEquals(Sorting.selectionSort(a), res);
    }

    @Test
    public void testBubbleSort() {
        int a[] = {68, 23, 66, 83, 56, 67, 33, 40, 93, 5, 11, 68};
        assertArrayEquals(Sorting.bubbleSort(a), res);
    }

    @Test
    public void testQuickSort() {
        int a[] = {68, 23, 66, 83, 56, 67, 33, 40, 93, 5, 11, 68};
        assertArrayEquals(Sorting.quickSort(a), res);
    }

    @Test
    public void testMergeSort() {
        int a[] = {68, 23, 66, 83, 56, 67, 33, 40, 93, 5, 11, 68};
        assertArrayEquals(Sorting.mergeSort(a), res);
    }

    @Test
    public void testShellSort() {
        int a[] = {68, 23, 66, 83, 56, 67, 33, 40, 93, 5, 11, 68};
        assertArrayEquals(Sorting.shellSort(a), res);
    }
}
