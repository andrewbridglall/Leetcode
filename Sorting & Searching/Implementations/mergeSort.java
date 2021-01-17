public class mergeSort {

    public void mergesort(int[] array) {
        mergesort(array, new int[array.length], 0, array.length - 1);
    }

    public void mergesort(int[] array, int[] temp, int leftStart, int rightEnd) {
        if (leftStart >= rightEnd)
            return;

        int middle = (leftStart + rightEnd) / 2;
        mergesort(array, temp, leftStart, middle); // left array
        mergesort(array, temp, middle + 1, rightEnd); // right array
        mergehalves(array, temp, leftStart, rightEnd); // combine
    }

    public void mergehalves(int[] array, int[] temp, int leftStart, int rightEnd) {
        int leftEnd = (leftStart + rightEnd) / 2;
        int rightStart = leftEnd + 1;
        int size = rightEnd - leftStart + 1;

        int left = leftStart, right = rightStart, index = leftStart;

        while (left <= leftEnd && right <= rightEnd) {
            if (array[left] <= array[right]) {
                temp[index] = array[left];
                left++;
            } else {
                temp[index] = array[right];
                right++;
            }
            index++;
        }

        System.arraycopy(array, left, temp, leftEnd - left + 1, index);
        System.arraycopy(array, right, temp, rightEnd - right + 1, index);
        System.arraycopy(temp, leftStart, array, leftStart, size);

    }

}
// time complexity: O(nlogn) average and worst case
// space complexity: O(n) due to auxiliary space used to merge parts of array
// Notes: divide and conquer algorithm
// System.arraycopy(source arr, source pos, dest arr, dest pos, length)
// arraycopy is O(n) worst case runtime