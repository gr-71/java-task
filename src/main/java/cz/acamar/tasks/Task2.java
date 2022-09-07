package cz.acamar.tasks;

public class Task2 {

    /**
     * Task 2. Squares of a sorted array.
     * <p>
     * Given an integer array sorted in non-decreasing order,
     * return an array of the squares of each number sorted in non-decreasing order.
     * <p>
     * Example input: [-4,-1,0,3,10]
     * Expected output: [0,1,9,16,100]
     * <p>
     * Explanation: After squaring, the array becomes [16,1,0,9,100].
     * After sorting, it becomes [0,1,9,16,100].
     *
     * @param input - an integer array sorted in non-decreasing order
     * @return - an array of the squares of each number sorted in non-decreasing order
     */
    public int[] squaresOfSortedArray(int[] input) {

        int n = input.length;
        int [] result = new int[n];

        int i = 0;
        int j = n - 1;

        for (int k = n - 1; k >= 0 ; k--) {
            if(Math.abs(input[i]) > Math.abs(input[j])){
                result[k] = input[i] * input[i];
                i++;
            } else {
                result[k] = input[j] * input[j];
                j--;
            }
        }
        return result;
    }
}
