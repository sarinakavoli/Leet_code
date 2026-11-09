class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = (nums.length)*2;
        int[] ans = new int [len];
        for(int i=0; i<len; i++){
            if(i > nums.length || i == nums.length){
                ans[i] = nums[i - nums.length];
            }
            else{
                ans[i] = nums[i];
            }
            
        }
      return ans;
    }
}