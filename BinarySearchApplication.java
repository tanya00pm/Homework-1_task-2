package ru.levelup.tatiana_nesterova.qa.homework1.task2;
import java.util.Scanner;

public class BinarySearchApplication {
    // Tatiana Nesterova, homework #1, task #2

    public static void main(String[] args) {

        BinarySearchApplication app = new BinarySearchApplication();
        app.startApplication();

    }

    public void startApplication() {

        // initial array
        double mas[] = {8, 15, 26, 38, 42, 50, 55, 63, 67, 71, 77, 79, 80, 81, 88, 92, 96, 98, 99, 107};

        System.out.println("Enter key:");
        Scanner in = new Scanner(System.in);
        double key = in.nextDouble();
        in.close();

        BinarySearch cl = new BinarySearch(mas);
        // binary search function
        int key_index = cl.SearchIndex(mas, key);

        this.PrintSearchResults(key_index, key);

    }

    public void PrintSearchResults(int result_index, double key) {
        // print the results method

        if (result_index == -999)
            System.out.println("Specified key does not exist in array\n");
        else
            System.out.println("Index for key " + key + " is " + result_index);

    }

}
