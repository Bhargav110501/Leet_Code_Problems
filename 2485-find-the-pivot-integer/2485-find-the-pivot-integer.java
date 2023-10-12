class Solution {
    public int pivotInteger(int n) {
        double sum = (double)(n * (n + 1) ) / 2;
        double x = Math.sqrt(sum);
        
        return (x == Math.floor(x)) ? (int) x : -1;
    }
}