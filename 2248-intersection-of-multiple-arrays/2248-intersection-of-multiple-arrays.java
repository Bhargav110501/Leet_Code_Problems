class Solution {
    public List<Integer> intersection(int[][] nums) {
        HashSet<Integer> s1 = new HashSet<>();
        
        for(int i = 0; i<nums[0].length; i++){
            s1.add(nums[0][i]);
        }
        
        for(int i=1;i<nums.length;i++){
            HashSet<Integer> s2 = new HashSet<>();
            for(int j=0;j<nums[i].length;j++){
                if(s1.contains(nums[i][j])){
                    s2.add(nums[i][j]);
                }
            }
            s1.retainAll(s2);
        }
        ArrayList<Integer> li = new ArrayList<>(s1);
        Collections.sort(li);
        
        return li;
    }
}