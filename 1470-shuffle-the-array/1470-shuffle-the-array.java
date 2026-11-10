class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int right[] = new int [2*n];
        int left[] = new int [2*n];

        for(int i=0; i<nums.length; i++){
            if(i == n || i > n){
                left[i] = nums[i];
            }
            else{
                right[i] = nums[i];
            }
    
        }
        

        for(int i=0; i<n; i++){
            nums[2*i] = right[i]; 
            nums[2*i+1] = left[n+i];
            
        }

        return nums;
    }
}