class Solution {
    private int waveCount(int num){
        if(num < 100) return 0;
        String s = Integer.toString(num);
        int total =0;
        for(int i=1; i<s.length()-1; i++){
            boolean ispeak = s.charAt(i-1)<s.charAt(i) && s.charAt(i)>s.charAt(i+1);
            boolean isvalley = s.charAt(i-1)>s.charAt(i) && s.charAt(i)<s.charAt(i+1);
            if(ispeak || isvalley){
                total++;
            }
        }
        return total;

    }
    public int totalWaviness(int num1, int num2) {
        int count =0;
        for(int i=num1; i<=num2; i++){
            count += waveCount(i);
        }
        return count;
    }
}