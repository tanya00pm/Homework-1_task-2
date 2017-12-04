package ru.levelup.tatiana_nesterova.qa.homework1.task2;

public class BinarySearch {
    private double arr[];

    public BinarySearch(double[] arr) {
        // constructor
        this.arr = arr;
    }

    public void PrintArray() {
        for (int i=0; i< arr.length; i++)
            System.out.println(Double.toString(arr[i]));
    }

    public int SearchIndex(double array[], double key) {
        // binary search method

        int left = 0;
        int right = array.length;
        int search = -999;

        while (left <= right)
        {
            int middle = (left + right) / 2;

            if (key == array[middle])
            {
                search = middle;
                break;
            }

            if (key < array[middle])
                right = middle - 1;
            else
                left = middle + 1;
        }
        return search;

    }
}
