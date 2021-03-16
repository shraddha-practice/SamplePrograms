/* A binary gap within a positive integer N is any maximal sequence of consecutive zeros
that is surrounded by ones at both ends in the binary representation of N. */

import java.util.*;
class BinaryGap {
    public static void main(String[] args) throws Exception {

        int n = 241;
        System.out.println(solution(n));

    }
    public static int solution(int N) {

        String binary_value = Integer.toBinaryString(N);
        int count=0;  // counter for zeros in binary_value
        ArrayList<Integer> lengths = new ArrayList<Integer>();	//list of binaryvalue gaps

        for(int i = 0; i< binary_value.length(); i++)
        {
            if(binary_value.charAt(i)=='1' && (i+1) < binary_value.length() && binary_value.charAt(i+1)=='0' )    //search first encounter of 1 and only if subsequent charactor is 0 start counting the 0's
            {
                count +=1;
                i++;
                while(binary_value.length() > (i+1) && binary_value.charAt(i+1) == '0' ) //increment count if subsequent zeros are present
                {
                    count+=1;
                    i++;
                    if((i+1) < binary_value.length() && binary_value.charAt(i+1)=='1') //next index within range
                    {
                        break;
                    }
                }
                if(binary_value.length() > (i+1) && binary_value.charAt(i+1)=='1') //add to lengths only if ending with 1
                {
                    lengths.add(count);
                    count =0;         //initializing count
                }
            }
        }
        if(lengths.size()==0)
            return 0;
        else
            return Collections.max(lengths);
    }
}

