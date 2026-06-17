class Solution {
    public char processStr(String s, long k) {
        long l =0;
        for(char c : s.toCharArray()){
            if(c == '*'){
                if(l > 0){
                    l--;
                }
            }else if(c == '#'){
                l *= 2;
            }else if(c == '%'){
                continue;
            }else{
                l++;
            }
        }
        if(k >= l ){
            return '.';
        }

        for(int i = s.length()-1; i>=0; i--){
            if(s.charAt(i) == '*'){
                l++;
            }else if(s.charAt(i) == '#'){
                l = l/2;
                k %=l;
            }else if(s.charAt(i) == '%'){
                k = l-k-1;
            }else{
                l--;
            }
            if(k == l){
                return s.charAt(i);
            }
        }
        return '.';
    }
}