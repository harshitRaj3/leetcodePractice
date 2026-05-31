class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
   long gain=mass;
   for(int i=0;i<asteroids.length;i++){
           if(gain<asteroids[i]) return false;

           gain=gain+asteroids[i];
    }
        return true;
    }
}