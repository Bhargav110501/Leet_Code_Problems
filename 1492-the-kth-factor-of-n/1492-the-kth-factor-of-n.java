class Solution {
    public int kthFactor(int n, int k) {
        ArrayList<Integer> li = new ArrayList<Integer>();
        for (int i = 1 ; i <= n ; i++){
            if(n % i == 0){
                li.add(i);
            }
        }
        return ((k<=li.size()) ? li.get(k-1) : -1);
    }
}