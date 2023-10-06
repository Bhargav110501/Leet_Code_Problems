class Solution {
    public boolean isPalindrome(String s) {
       String res = "" ;
        for (char ch : s.toCharArray()){
            if(Character.isDigit(ch) || Character.isLetter(ch)){
                res += ch;
            }
        }
        res = res.toLowerCase();
        int i = 0, j = res.length()-1;
        while(i <= j){
            if(res.charAt(i) != res.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}