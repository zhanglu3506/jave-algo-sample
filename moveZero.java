// Given an array of integers, move all the 0s to the right end of the array.
//
// The relative order of the elements in the original array does not need to be maintained.
//
// Assumptions:
//
// The given array is not null.
// Examples:
//
// {1} --> {1}
// {1, 0, 3, 0, 1} --> {1, 3, 1, 0, 0} or {1, 1, 3, 0, 0} or {3, 1, 1, 0, 0}
public class moveZero {
  public int[] moveZero(int[] array) {
    // Write your solution here
    if(array.length <= 1){
      return array;
    }
    int i = 0; // all number on the left of i should not be 0;
    int j = array.length - 1; // all number on the right of j should be 0;
    while(i <= j) {
      if(i == 0){
        swap(array, i, j);
        j--;
      } else {
        i++;
      }
    }
    return array;
  }
  private void swap(int[] array, int i, int j){
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }
}
