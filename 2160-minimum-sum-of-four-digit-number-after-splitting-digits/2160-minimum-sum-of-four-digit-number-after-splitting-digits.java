class Solution {
    public int minimumSum(int num) {
        int[] ar = new int[4];
        int i = 0;
        while(num>0){
            ar[i] = num % 10;
            num = num/10;
            i++;
        }
        Arrays.sort(ar);
        return (10 * (ar[0] + ar[1]) + ar[2] + ar[3]);
    }
}