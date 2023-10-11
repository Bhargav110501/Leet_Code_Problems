class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length ; i++){
            int left = i+1;
            int right = arr.length - i;
            int nums_subarrays = left * right;
            int odd_subarrays = ( nums_subarrays % 2 == 0) ? nums_subarrays / 2 : nums_subarrays / 2 + 1;
            sum += odd_subarrays * arr[i];
        }
        return sum;
    }
}