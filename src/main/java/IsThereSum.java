
public class IsThereSum {
    /**
     * Check if there exist two numbers in an array add up to some other number.
     * You will likely need a for loop nested inside of another for loop for this problem - each for loop checking
     * sums of two different indexes of arr.
     *
     * @param arr an array of ints.
     * @param target a hypothetical sum of two numbers.
     * @return true if two separate values in the array add up to a target, false otherwise.
     */
    public boolean check(int[] arr, int target){
        for (int ctr1 = 0; ctr1 < arr.length; ctr1++) {
            for (int ctr2 = 0; ctr2 < arr.length; ctr2++) {
                if (ctr2 == ctr1) {
                    continue;
                }

                if (arr[ctr1] + arr[ctr2] == target) {
                    return true;
                }
            }
        }
        return false;
    }
}
