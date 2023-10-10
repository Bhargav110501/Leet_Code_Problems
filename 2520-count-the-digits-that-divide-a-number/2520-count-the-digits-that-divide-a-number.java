class Solution {
    public int countDigits(int num) {
        int i = 0;
        int n = num;
        while(num > 0){
            if(n %(num % 10) ==0) i++;
            num /= 10;
        }
        return i;
    }
}