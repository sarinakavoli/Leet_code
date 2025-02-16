class Solution {
    public boolean isPalindrome(int x) {
        int origin = x;
        int reverse = 0;
        while(x != 0 && x > 0){
            int digit = x%10; 
            reverse = reverse * 10 + digit;
            x = x/10;
            }
        return reverse == origin ;
    }
}