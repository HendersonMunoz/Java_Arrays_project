package dev.hmprojects;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Main method - testing the code
        int[] returnedArray = readIntegers();
        System.out.println(Arrays.toString(returnedArray));

        int returnedMin = findMin(returnedArray);
        System.out.println("Minimum value = " + returnedMin);

        reverse(returnedArray);
        System.out.println("Reversed Array: " + Arrays.toString(returnedArray));
    }

    //method - will ask the user to enter a set of integers and will store them in an array
    private static int[] readIntegers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of integers, separated by commas:");
        String input = scanner.nextLine();

        String[] splits = input.split(",");
        int[] values = new int[splits.length];

        // looping through the array
        for (int i = 0; i < splits.length; i++) {
            values[i] = Integer.parseInt(splits[i].trim());
        }
        return values;
    }

    // method- find the lowest value
    private static int findMin(int[] array){
        int min = Integer.MAX_VALUE;
        // for each loop
        for (int eachLoop : array){
            if (eachLoop < min){
                min = eachLoop;
            }
        }
        return min;
    }

    //method - reversing the order of the array
    private static void reverse(int[] array){
        int maxIndex = array.length -1;
        // finding the middle of the array list
        int halfLength = array.length / 2;

        // for loop
        for (int i = 0; i < halfLength; i++){
            int temp = array[i];
            array[i] = array[maxIndex - 1];
            array[maxIndex - 1] = temp;
            System.out.println("Reversing array in progress ---> " + Arrays.toString(array));
        }
    }
}
