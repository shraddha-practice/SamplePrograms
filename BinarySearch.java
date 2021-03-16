// Binary search algo using recursion
import java.util.Arrays;

public class BinarySearch {

        // Returns index of x if it is present in arr[left..right], else return -1
        int binarySearch(int arr[], int left, int right, int x)
        {
            if (right >= left) {
                int mid = left + (right - left) / 2;

                // If the element is present at middle
                if (arr[mid] == x)
                    return mid;

                // If element is smaller than mid, search in left subarray
                if (arr[mid] > x)
                    return binarySearch(arr, left, mid - 1, x);

                // Else serach in right subarray
                return binarySearch(arr, mid + 1, right, x);
            }

            // element is not present in array
            return -1;
        }
        public static void main(String args[])
        {
            BinarySearch bs = new BinarySearch();
            int arr[] = { 2, 18, 7, 11, 9, 10, 22 , 45  };
            int n = arr.length;
            int x = 10;
            //sort the array first
            Arrays.sort(arr);
            int result = bs.binarySearch(arr, 0, n - 1, x);
            if (result == -1)
                System.out.println("Element not present");
            else
                System.out.println("Element found at :" + result);
        }
    }


