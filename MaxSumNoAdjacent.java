
public class MaxSumNoAdjacent {

        static int maxLen = 10;

        static int dp[] = new int[maxLen];

        static boolean v[] = new boolean[maxLen];

        // find the maximum sum subsequence where no two elements are adjacent
        int FindMaxSum(int arr[], int n)
        {
            int inc_ele = arr[0];
            int exc_ele = 0;
            int exc_ele_new;
            int i;
            for (i = 1; i < n; i++)
            {
                // current max excluding i
                exc_ele_new = (inc_ele > exc_ele) ? inc_ele : exc_ele;

                // current max including i
                inc_ele = exc_ele + arr[i];
                exc_ele = exc_ele_new;
            }

            // return max of inc_ele and exc_ele
            return ((inc_ele > exc_ele) ? inc_ele : exc_ele);
        }

        public static void main(String args[])
        {
            MaximumSum sum = new MaximumSum();
            int arr[] = new int[]{2, 5, 7, 8, 10 , 11 };
            System.out.println(sum.FindMaxSum(arr, arr.length));
        }
}
