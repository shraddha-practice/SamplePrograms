/*

An array A consisting of N integers is given. Rotation of the array means that each element is shifted right by one index, and the last element of the array is moved to the first place. For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7] (elements are shifted right by one index and 6 is moved to the first place).

The goal is to rotate array A K times; that is, each element of A will be shifted to the right K times.

Write a function:

class Solution { public int[] solution(int[] A, int K); }

that, given an array A consisting of N integers and an integer K, returns the array A rotated K times.

For example, given

    A = [3, 8, 9, 7, 6]
    K = 3
the function should return [9, 7, 6, 3, 8]. Three rotations were made:

    [3, 8, 9, 7, 6] -> [6, 3, 8, 9, 7]
    [6, 3, 8, 9, 7] -> [7, 6, 3, 8, 9]
    [7, 6, 3, 8, 9] -> [9, 7, 6, 3, 8]

 */

public class ArrayRotation {

        public int[] solution(int[] A, int K) {
            int [] rotatedA = new int[A.length];

            for(int i=0; i<A.length; i++) {

                int rotatedIndex = (i + K) % A.length;

                rotatedA[rotatedIndex] = A[i];
            }
            return rotatedA;

        }
        public static void main (String [] args ){
            int[] A = {3, 8, 9, 7, 6};
            int K = 3;
            ArrayRotation rtr = new ArrayRotation();
            A = rtr.solution(A, K);
            for (int i=0; i<A.length; i++)
                System.out.print(A[i] + ",");
    }

}
