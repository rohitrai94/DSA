class Solution {
    public String processStr(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if('*' == s.charAt(i) ){
                if(sb.length()<=0){
                    continue;
                }else{
                    sb = sb.deleteCharAt(sb.length()-1);
                }
            }else if('#' == s.charAt(i)){
                sb = sb.append(sb);
            }else if('%' == s.charAt(i)){
                sb = sb.reverse();
            }else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}