public class quickSort {

    public void quicksort(int[] array) {
        quicksort(array, 0, array.length - 1);
    }

    public void quicksort(int[] array, int left, int right) {
        if (left >= right)
            return;

        int pivot = array[(left + right) / 2];
        int index = partition(array, left, right, pivot);
        quicksort(array, left, index - 1);
        quicksort(array, index, right);

    }

    public int partition(int[] array, int left, int right, int pivot) {
        while (left <= right) {
            while (array[left] < pivot) {
                left++;
            }
            while (array[right] > pivot) {
                right--;
            }
            if (left <= right) {
                swap(array, left, right);
                left++;
                right--;
            }
        }
        return left; // not sure why we return left though?
    }

}
// time complexity: O(nlogn) average case, O(n^2) worst case
// worst case bc pivot not guaranteed to be the median
// space complexity: O(logn) bc there are logn stack frames
// Notes: divide and conquer algorithm