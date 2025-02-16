class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> romanMap = new HashMap<>();
        int res = 0;
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        for(int i=0; i<s.length(); i++){
            if(i<s.length()-1 && romanMap.get(s.charAt(i)) < romanMap.get(s.charAt(i + 1))){
                res = res - romanMap.get(s.charAt(i)) ; 
            }else{
                res = res + romanMap.get(s.charAt(i));}
        }

        return res;  
    }
}