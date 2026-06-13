class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb = new StringBuilder();
        for(String word : words){
            int sum =0;
            for(int j=0; j<word.length(); j++){
                sum += weights[word.charAt(j )-'a'];
            }
            sb.append((char)('z'-(sum%26)));
        }
        return sb.toString();
    }
}