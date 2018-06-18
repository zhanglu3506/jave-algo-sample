// Description
// Given an array of integers, sort the elements in the array in ascending order. The quick sort algorithm should be used to solve this problem.
//
// Examples
//
// {1} is sorted to {1}
// {1, 2, 3} is sorted to {1, 2, 3}
// {3, 2, 1} is sorted to {1, 2, 3}
// {4, 2, -3, 6, 1} is sorted to {-3, 1, 2, 4, 6}
// Corner Cases
//
// What if the given array is null? In this case, we do not need to do anything.
// What if the given array is of length zero? In this case, we do not need to do anything.
public class quickSort {
  public int[] quickSort(int[] array) {
    // corner case handling,when array is null and array length is equal or less than 1 return array directly.
    if(array == null || array.length <= 1) {
      return array;
    }
    partition(array, 0, array.length-1);
    return array;
  }
  private void partition(int[] array, int left, int right){
    // base case return. when left = right, there are no need to continue the partition and sort.
    if(left >= right) {
      return;
    }
    // select the most right element index as the pivot.
    int pivot = right;
    int i = left;
    int j = right - 1;
    while(i <= j) {
      if(array[i] <= array[pivot]) {
        i++;
      } else if(array[j] > array[pivot]) {
        j--;
      } else {
        swap(array, i, j);
        i++;
        j--;
      }
    }
    swap(array, i, pivot);
    partition(array, left, i-1);
    partition(array, i+1, right);
  }
  private void swap(int[] array, int i, int j){
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }
}
