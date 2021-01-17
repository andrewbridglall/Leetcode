public class selectionSort {

    public void selectionsort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min_index = i;
            // j goes from i+1 to end of array (does not go out of bounds)
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min_index]) {
                    min_index = j;
                }
                int temp = array[i];
                array[i] = array[min_index];
                array[min_index] = temp;
            }
        }
    }

}
// Time complexity: O(n^2) average and worst case
// Space complexity: O(1)