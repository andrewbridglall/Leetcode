import java.util.Arrays;

public class radixSort {

    public void radixsort(int[] array, int n) {
        int m = getMax(array, n);
        for (int exp = 1; m / exp > 0; exp *= 10)
            countSort(array, n, exp);

    }

    public int getMax(int array[], int n) {
        int max = array[0];
        for (int i = 1; i < n; i++)
            if (array[i] > max)
                max = array[i];
        return max;
    }

    public void countSort(int[] array, int n, int exp) {
        int[] output = new int[n];
        int[] count = new int[10];
        Arrays.fill(count, 0);

        for (int i = 0; i < n; i++)
            count[(array[i] / exp) % 10]++;

        for (int i = 1; i < 10; i++)
            count[i] += count[i - 1];

        for (int i = n - 1; i >= 0; i--) {
            output[count[(array[i] / exp) % 10] - 1] = array[i];
            count[(array[i] / exp) % 10]--;
        }

        for (int i = 0; i < n; i++)
            array[i] = output[i];

    }
}
// time complexity: O(kn), k is largest element - linear time
// space complexity: O(k+n)
// Note: non-comparison based sorting algorithm
// uses counting sort as as subroutine
// Numbers increase linearly but number of digits increase logarithmically.