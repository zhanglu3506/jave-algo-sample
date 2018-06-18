public class mergeSort {
  public int[] mergeSort(int[] array) {
    // Write your solution here
    if(array == null || array.length <= 1){
      return array;
    }
    mergeSort(array, 0, array.length-1);
    return array;
  }
  private static void mergeSort(int[] array, int left, int right) {
    if(left >=  right) { // when left == right, which means there is only one element, we don't need to sort one element, return directly.
      return;
    }
    // found the mid index; because left is always positive integer so this will never over stack.
    int mid = left + (right - left)/2;
    mergeSort(array, left, mid); // sort left side.
    mergeSort(array, mid+1, right); // sort right side.

    int k = left;
    int l = left;
    int r = mid + 1;
    int[] helperArray = new int[array.length];
    for(int i = left; i <= right; i++){
      helperArray[i] = array[i];
    }
    while(l <= mid && r <= right){
      if(helperArray[l] <= helperArray[r]){
        array[k] = helperArray[l];
        l++;
      } else {
        array[k] = helperArray[r];
        r++;
      }
      k++;
    }
    while(l <= mid){
      array[k] = helperArray[l];
      l++;
      k++;
    }
  }
}
