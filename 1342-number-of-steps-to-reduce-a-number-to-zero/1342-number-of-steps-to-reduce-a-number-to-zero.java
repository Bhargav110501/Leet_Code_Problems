class Solution {
    public int numberOfSteps(int num) {
        int i = 0;
        while(num != 0 ){
            num = (num % 2 != 0) ? num - 1 : num / 2;
            i++;
        }
        return i;
    }
}