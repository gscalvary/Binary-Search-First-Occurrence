package com.oliver;

public class BinarySearcher {

    // This variant of binary search looks for the first occurrence of an element
    // with a particular value in a sorted array.
    public int search(int test, int[] array) {

        int lower = 0;
        int upper = array.length - 1;

        while(lower <= upper) {
            int mid = lower + (upper - lower) / 2;
            if(array[mid] == test) {
                if(mid - 1 < 0 || array[mid - 1] != test) {
                    return mid;
                } else {
                    upper = mid - 1;
                }
            } else if(array[mid] > test) {
                upper = mid - 1;
            } else {
                lower = mid + 1;
            }
        }

        return -1;
    }
}
