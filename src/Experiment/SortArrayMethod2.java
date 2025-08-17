package Experiment;

public class SortArrayMethod2 {

        public static void main(String[] args) {
            int[] numbers = {5, 3, 8, 1, 2};

            System.out.print("Original Array: ");
            for (int n : numbers) {
                System.out.print(n + " ");
            }
            System.out.println();

            // Bubble Sort
            for (int i = 0; i < numbers.length - 1; i++) {
                for (int j = 0; j < numbers.length - i - 1; j++) {
                    if (numbers[j] > numbers[j + 1]) {
                        // swap numbers[j] and numbers[j+1]
                        int temp = numbers[j];
                        numbers[j] = numbers[j + 1];
                        numbers[j + 1] = temp;
                    }
                }
            }

            System.out.print("Sorted Array (Ascending): ");
            for (int n : numbers) {
                System.out.print(n + " ");
            }
        }
    }


