package Experiment;

import java.util.Arrays;
import java.util.Collections;

public class sortArayd {



        public static void main(String[] args) {
            Integer[] numbers = {5, 3, 8, 1, 2}; // Use Integer (not int) for Collections.reverseOrder()

            System.out.println("Original Array: " + Arrays.toString(numbers));

            // Sorting in descending order
            Arrays.sort(numbers, Collections.reverseOrder());

            System.out.println("Sorted Array (Descending): " + Arrays.toString(numbers));
        }
    }


