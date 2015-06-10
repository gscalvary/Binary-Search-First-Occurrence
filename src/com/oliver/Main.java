package com.oliver;

public class Main {

    public static void main(String[] args) {

        int test = 108;
        int[] array = new int[]{-14, -10, 2, 108, 108, 243, 285, 285, 285, 401};
        BinarySearcher searcher = new BinarySearcher();

        System.out.println("Search returns index: " + searcher.search(test, array));
    }
}
