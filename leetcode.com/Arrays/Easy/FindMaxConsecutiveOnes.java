/*
Given a binary array, find the maximum number of consecutive 1s in this array.

Example 1:
Input: [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s.
    The maximum number of consecutive 1s is 3
*/

class FindMaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int consecutive = 0;
        
        for(int num : nums) {
            
            if(num == 1) { consecutive++;}
            
            else {
                if(max < consecutive)
                    max = consecutive;
                
                consecutive = 0;
            }             
        }
        
        //Check if (max < consecutive) after the last number in array
        return (max < consecutive) ? consecutive : max;
    }
}
