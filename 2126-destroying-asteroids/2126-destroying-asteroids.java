class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long currMass = mass;
        for(int a : asteroids){
            if(currMass < a){
                return false;
            }
            currMass += a;
        }
        return true;
    }
}