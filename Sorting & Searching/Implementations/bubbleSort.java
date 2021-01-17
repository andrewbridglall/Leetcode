public class bubbleSort {

    public void bubblesort(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            // j < arr.length-i-1 bc i largest elements are at the back
            // so we don't have to touch them again
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // swap
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
// Time complexity: O(n^2) average and worst case
// Space complexity: O(1)