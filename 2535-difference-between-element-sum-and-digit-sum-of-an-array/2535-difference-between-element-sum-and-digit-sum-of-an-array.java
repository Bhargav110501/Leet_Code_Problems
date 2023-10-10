class Solution {
    public int differenceOfSum(int[] nums) {
        int eS = 0;
        int dS = 0;
        for(int i = 0 ; i < nums.length ; i++){
            eS += nums[i];
            while (nums[i] > 0) {
                    dS += nums[i] % 10;
                    nums[i] /= 10;
            }
        }
        return Math.abs(eS - dS);
    }
}