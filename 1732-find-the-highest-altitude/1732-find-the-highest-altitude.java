class Solution {
    public int largestAltitude(int[] gain) {
        int maxAltitude = Integer.MIN_VALUE;
        int currAltitude = 0;
        for(int i=0; i<gain.length; i++){
            currAltitude += gain[i];
            maxAltitude = Math.max(maxAltitude, currAltitude);
        }
        if( maxAltitude < 0){
            return 0;
        }
        return  maxAltitude;
    }
}