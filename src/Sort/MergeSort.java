// MergeSort.java
// merges two arrays into one

public class MergeSort {

  private static void Merge(int[] A, int[] temp, int lo, int mid, int hi) {

    int i = lo;
    int j = mid;

    for (int k = lo; l < hi; k++) {
      if (i == mid) temp[k] = A[j++];
      else if (j == hi) temp[k] = A[i++];
      else if (A[j] > A[i]) temp[k] = A[i++];
      else temp[k] = A[j++];
    }

    for (int k = lo; k < hi; k++) {
      A[k] = temp[k];
    }

    private static void MergeSort(int[] A, int lo, int hi) {

      if (hi - lo == 1) return;
      int mid = lo + (hi - lo) / 2;
      MergeSort(A, lo, mid);
      MergeSort(A, mid, hi);
      Merge(A, new int[A.length], lo, mid, hi);
    }

    // sorts the given list
    public static void sortNumbers(int[] A) {
      
      MergeSort(A, 0, A.length);
    }

    // testing purposes
    public static void main(String[] args) {

      int[] list = {156, 344, 54, 546, 767, 23, 34, 64, 234, 654, 234, 65, 234, 65, 87, 3, 5, 76, 24, 2, 3, 7, 9, 5, 34, 32, 4525, 345, 0};
      sortNumbers(list);

      for (int i = 0; i < list.length; i++) {
        System.out.println(list[i]);
    }
  }
}
