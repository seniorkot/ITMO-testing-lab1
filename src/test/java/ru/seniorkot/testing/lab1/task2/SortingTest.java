package ru.seniorkot.testing.lab1.task2;

import org.junit.Test;
import static org.junit.Assert.*;

public class SortingTest {

    @Test
    public void testMergeSort() {
        int a[] = {66, 9, 31, 96, 21, 17, 67, 54, 30, 81, 51, 87, 66, 26, 28, 50, 9, 86, 58, 63, 76,
                55, 66, 97, 59, 13, 27, 59, 79, 41, 50, 22, 26, 56, 87, 50, 15, 23, 51, 55, 83, 16, 86, 23, 6, 61, 98, 16, 35, 49};
        int res[] = {6, 9, 9, 13, 15, 16, 16, 17, 21, 22, 23, 23, 26, 26, 27, 28, 30, 31, 35, 41, 49, 50, 50, 50, 51, 51, 54, 55,
                55, 56, 58, 59, 59, 61, 63, 66, 66, 66, 67, 76, 79, 81, 83, 86, 86, 87, 87, 96, 97, 98};
        assertArrayEquals(Sorting.mergeSort(a), res);
    }
}
